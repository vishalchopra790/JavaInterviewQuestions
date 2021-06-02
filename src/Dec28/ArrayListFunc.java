package Dec28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFunc {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("20");
        list.add("30");
        list.add("40");

        // Iterating through while loop
        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // Iterating with for loop
        for (Object obj : list)
            System.out.println(obj);

        //Iterating with for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
