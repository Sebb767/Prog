package Uebung9;

import java.lang.reflect.Field;

/**
 * Created by sebb on 12/9/15.
 */
public class Main {

    // A2
    public static void main(String[] args) {
        Auto[] autos = new Auto[]{
                new Auto("VW", "Polo", "Weis", 85, 123),
                new Auto("BMW", "M4", "Schwarz", 460, 321),
                new Auto("Ford", "Christenfisch", "Rot", 1, 1)
        };



        /*
        int max = -1, idx = -1;
        for (int i = 0; i < autos.length; i++) if (autos[i].getHubraum() > max)
        {
            max = autos[i].getHubraum();
            idx = i;
        }
        System.out.println(autos[idx]);*/
        //scanClass((Object)autos);
        scanClass(new Auto("VW", "Polo", "Weis", 85, 123),
                new Auto("BMW", "M4", "Schwarz", 460, 321),
                new Auto("Ford", "Christenfisch", "Rot", 1, 1));
    }

    public static void scanClass(Object... o)
    {
        for (Object instance : o) {
            Field[] fields = instance.getClass().getDeclaredFields();

            System.out.printf("Class: %s\n", instance.getClass().getName());
            for (Field field : fields) {
                field.setAccessible(true);

                String mod = String.valueOf(field.getModifiers()), name = field.getName(), value;
                try
                {
                    value = field.get(instance).toString();
                }
                catch (IllegalAccessException e)
                {
                   value = "Can't get value :/";
                }

                System.out.printf("[%s] %s = %s\n", mod, name, value);
            }
            System.out.println();
        }

    }
}
