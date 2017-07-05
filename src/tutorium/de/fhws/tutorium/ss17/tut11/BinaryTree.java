package de.fhws.tutorium.ss17.tut11;

/**
 * Created by Sebastian Kaim on 7/5/17.
 */
public class BinaryTree<T extends Comparable<T>> {

    public Leave<T> root;

    public void Insert(Comparable<T> data)
    {
        if(root == null)
        {
            root = new Leave<T>(data);
        }
        else
        {
            root.Insert(data);
        }
    }

    @Override
    public String toString() {
        return "" + root;
    }

    public static class Leave<T extends Comparable<T>> {
        public Comparable element;
        public Leave<T> left, right;

        public Leave(Comparable element) {
            this.element = element;
        }

        public void Insert(Comparable<T> data)
        {
            if(element.compareTo(data) < 0)
            {
                if(left == null)
                    left = new Leave<T>(data);
                else
                    left.Insert(data);
            }
            else
            {
                if(right == null)
                    right = new Leave<T>(data);
                else
                    right.Insert(data);
            }
        }

        @Override
        public String toString() {
            return (left == null ? "" : left + "\n") + element + (right == null ? "" : "\n" + right);
        }
    }

    public static void main(String[] args) {
        BinaryTree<String> bt = new BinaryTree<>();

        bt.Insert("Hello");
        bt.Insert("World");
        bt.Insert("asd");

        System.out.println(bt);
    }
}
