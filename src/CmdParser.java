import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by sebb on 10/22/15.
 */
public class CmdParser {
    private Dictionary<String, ICommand> cmds = new Hashtable<>();

    /**
     * Adds a command
     * @param cmd The command
     * @param doubledash The '--' version
     */
    public void add(ICommand cmd, String doubledash ) {
        this.add(cmd, doubledash, null);
    }

    /**
     * Adds a command
     * @param cmd The command
     * @param doubledash The -- version
     * @param shortversion The short version
     */
    public void add(ICommand cmd, String doubledash, String shortversion )
    {
        if(doubledash != null)
            cmds.put("--" + doubledash, cmd);
        if(shortversion != null)
            cmds.put(shortversion, cmd);
    }

    public void parse(String[] args)
    {
        for(String arg : args) {
            if(arg.startsWith("--"))
                if(cmds.get(arg) != null)
                {
                    cmds.get(arg).execute();
                }
            else if(arg.startsWith("-")) // can't be - since its filtered above
            {
                String params = arg.substring(1); // strip -
                for(char c : params.toCharArray())
                    if(cmds.get(c) != null)
                    {
                        cmds.get(c).execute();
                    }
            }
        }
    }
}

