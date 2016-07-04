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
        return map(x -> from.getTime() >= x.getTimestamp() && to.getTime() <= x.getTimestamp());
    }

    public LogEntry[] logsForSysten(String systemName) {
        return map(x -> x.getName().equals(systemName));
    }

    protected LogEntry[] map(java.util.function.Predicate<? super LogEntry> mapper)
    {
        return (LogEntry[]) c
                .parallelStream()
                .filter(mapper)
                .toArray();
    }

}
