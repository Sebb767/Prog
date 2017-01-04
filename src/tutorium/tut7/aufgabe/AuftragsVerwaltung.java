package tut7.aufgabe;

import java.util.*;

/**
 * Created by proj on 1/4/17.
 */
public class AuftragsVerwaltung implements Iterable<Auftrag> {
    protected HashMap<String, Auftrag> content = new HashMap<>();

    public void add(Auftrag at)
    {
        content.put(at.getId(), at);
    }

    public static class AvIterator implements Iterator<Auftrag>
    {
        protected Auftrag[] c;
        protected int index = 0;

        public AvIterator(Collection<Auftrag> c) {
            this.c = c.toArray(new Auftrag[0]);
        }

        @Override
        public boolean hasNext() {
            return index < c.length;
        }

        @Override
        public Auftrag next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return c[index++];
        }
    }

    @Override
    public Iterator<Auftrag> iterator() {
        return new AvIterator(content.values());
    }

    public List<Auftrag> inhaltAlsListe()
    {
       return new ArrayList<>(content.values());
    }

    public Stack<Auftrag> nachArbeitsstunden()
    {
        List<Auftrag> ts = inhaltAlsListe();

        Collections.sort(ts, new Comparator<Auftrag>() {
            @Override
            public int compare(Auftrag o1, Auftrag o2) {
                return o1.getStunden() - o2.getStunden();
            }
        });

        return new Stack<>(ts);
    }

    public Stack<Auftrag> nachId()
    {
        List<Auftrag> ts = inhaltAlsListe();

        class IdSort implements Comparator<Auftrag> {
            @Override
            public int compare(Auftrag o1, Auftrag o2) {
                return  o1.getId().compareTo(o2.getId());
            }
        }

        Collections.sort(ts, new IdSort());

        return new Stack<>(ts);
    }
}
