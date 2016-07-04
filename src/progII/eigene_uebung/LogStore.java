package eigene_uebung;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;



public class LogStore {
    protected Collection<LogEntry> c;

    public LogStore() {
        c = new ArrayList<>();
    }

    public void add(LogEntry e) {
        c.add(e);
    }

    public LogEntry[] logsAsArray() {
        return c.toArray(new LogEntry[0]);
    }

    public LogEntry[] logsBetween(Date from, Date to) {
        return (LogEntry[]) c
                .parallelStream()
                .map(x -> from.getTime() >= x.getTimestamp() && to.getTime() <= x.getTimestamp())
                .toArray();
    }

    public LogEntry[] logsForSysten(String systemName) {
        return (LogEntry[]) c
                .parallelStream()
                .map(x -> x.getName().compareTo(systemName))
                .toArray();
    }

}
