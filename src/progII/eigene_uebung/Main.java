package eigene_uebung;

public class Main {

    public static void main(String[] args) {
        FileIterator fi = new FileIterator("/home/proj/Projekte/fh/Prog/src/progII/eigene_uebung/logfile.txt");
        LogStore ls = new LogStore();

        while (fi.hasNext())
            ls.add(new LogEntry(fi.next()));

        LogEntry[] output = ls.logsAsArray();
        for (LogEntry e: output)
            System.out.println(e);
    }

}
