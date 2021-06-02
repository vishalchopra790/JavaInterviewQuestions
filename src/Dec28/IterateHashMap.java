package Dec28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Vishal");
        map.put(2, "Sahil");
        map.put(3, "Rajesh");
        map.put(4, "Manoj");

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            System.out.println("Key is" + m.getKey() + "Value" + m.getValue());
        }

        for (Map.Entry<Integer, String> me : map.entrySet()) {
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
        }
    }
}
