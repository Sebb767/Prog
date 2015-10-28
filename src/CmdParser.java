import java.util.*;

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
        int executed = 0;

        for(String arg : args) {
            if(arg.equals(args[0]))
                continue;
            else if(arg.startsWith("--"))
                if(cmds.get(arg) != null)
                {
                    cmds.get(arg).execute();
                    executed++;
                }
            else if(arg.startsWith("-")) // can't be - since its filtered above
            {
                String params = arg.substring(1); // strip -
                for(char c : params.toCharArray())
                    if(cmds.get(c) != null)
                    {
                        cmds.get(c).execute();
                        executed++;
                    }
            }
            else
            {
                System.out.println("Unknown arg: "+arg);
            }
        }

        if(executed == 0)
        {
            String usage = "Usage: " + args[0],
                    shortv = "", longv = "", current;
            Enumeration keys = cmds.keys();

            while(keys.hasMoreElements())
            {
                current = (String)keys.nextElement();

                if(current.startsWith("--"))
                {
                    longv += " ";
                    longv += current;
                }
                else
                {
                    if(shortv.length() == 0)
                        shortv += " -";

                    shortv += current;
                }
            }

            System.out.println(usage + shortv + longv);
        }
    }
}

