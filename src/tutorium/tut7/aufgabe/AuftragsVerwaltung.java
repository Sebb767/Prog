package tut7.aufgabe;

import java.io.*;
import java.util.*;

/**
 * Created by proj on 1/4/17.
 */
public class AuftragsVerwaltung implements Iterable<Auftrag>, Serializable {
    protected HashMap<String, Auftrag> content = new HashMap<>();
    transient private int test;

    public void add(Auftrag at) throws MyDuplicateElementException
    {
        if(content.containsKey(at.getId()))
            throw new MyDuplicateElementException();

        content.put(at.getId(), at);
    }

    public Auftrag get(String id) throws MyNoSuchElementException
    {
        if(!content.containsKey(id))
            throw new MyNoSuchElementException();

        return content.get(id);
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

        Comparator<Auftrag> myComp = new Comparator<Auftrag>() {
            @Override
            public int compare(Auftrag o1, Auftrag o2) {
                return o1.getStunden() - o2.getStunden();
            }
        };

        Collections.sort(ts, myComp);

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

    public void vonDateiEinlesen(String pfad) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(pfad)));

        String line;

        while((line = br.readLine()) != null)
        {
            String[] data = line.split(";");
            assert (data.length == 2);
            try {
                this.add(new Auftrag(data[0], Integer.parseInt(data[1])));
            } catch (MyDuplicateElementException e) {
                // :/
            }
        }

        br.close();
    }

    public void toFile(String pfad) throws IOException
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pfad));

        oos.writeObject(this);

        oos.close();
    }

    public static AuftragsVerwaltung fromFile(String pfad) throws IOException, ClassNotFoundException
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(pfad));

        AuftragsVerwaltung av = (AuftragsVerwaltung)ois.readObject();

        ois.close();
        return av;
    }
}
