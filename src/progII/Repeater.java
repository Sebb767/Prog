import java.util.*;
public class Repeater extends TimerTask {
    String m;
    int c;
    int d;

    Repeater(String m, int d, int c)
    {
        this.m = m;
        this.c = c;
        this.d = d;
        delay();
    }

    public void delay()
    {
        Timer t = new Timer();
        t.schedule(this, d);
    }

    public void run() {
        System.out.print(m);
        c--;
        if (c>0)
            new Repeater(m, d, c);
    }

    public static void main(String [] args)
    {
        new Repeater(" klopf ", 300, 9);
        new Repeater(" Penny \n", 1000, 3);
    }
}