package tut7.live;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import tut7.aufgabe.Stack;

import java.util.*;

/**
 * Created by proj on 1/11/17.
 */
public class AuftragsVerwaltung implements Iterable<Auftrag> {
    protected ArrayList<Auftrag> content = new ArrayList<>();


    public void addAuftrag(Auftrag neu)
    {
        content.add(neu);
    }

    @Override
    public Iterator<Auftrag> iterator() {
        return new AuftragsIterator(content);
        //return content.iterator();
    }

    public Stack<Auftrag> AuftraegeByArbeitsStunden()
    {
        ArrayList<Auftrag> ret = content;
        Collections.sort(ret, new Comparator<Auftrag>() {
            @Override
            public int compare(Auftrag o1, Auftrag o2) {
                return o1.getArbeitsstunden() - o2.getArbeitsstunden();
            }
        });

        return new Stack<>(ret);
    }

    public Stack<Auftrag> AuftraegeById()
    {
        ArrayList<Auftrag> ret = content;
        class AuftragSortierer implements Comparator<Auftrag> {
            @Override
            public int compare(Auftrag o1, Auftrag o2) {
                return o1.getKennung().compareTo(o2.getKennung());
            }
        }

        Collections.sort(ret, new AuftragSortierer());
        return new Stack<>(ret);
    }

    public static class AuftragsIterator implements Iterator<Auftrag> {
        ArrayList<Auftrag> c;
        int count = 0;

        public AuftragsIterator(ArrayList<Auftrag> c) {
            this.c = c;
        }

        @Override
        public boolean hasNext() {
            //return c.size() > 0;
            return count < c.size();
        }

        @Override
        public Auftrag next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return c.get(count++);
        }

        public void remove()
        {
            throw new NotImplementedException();
        }
    }
}
