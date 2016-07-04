package eigene_uebung;

public class LogEntry {
    protected final long timestamp;
    protected final String name, failureDescription;
    protected final int id;

    protected static int ID = 0;

    public LogEntry(final String line) {

        final String[] entry = line.split("-", 3);
        this.timestamp = Long.parseLong(entry[0]);
        this.name = entry[1];
        this.failureDescription = entry[2];
        id = ID++;
    }

    /**
     * Nur Setter, da hier nichts verändert werden muss.
     */

    @Override
    public String toString() {
        return timestamp + "-" + name + "-" + failureDescription;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getName() {
        return name;
    }

    public String getFailureDescription() {
        return failureDescription;
    }

    public int getId() {
        return id;
    }
}
