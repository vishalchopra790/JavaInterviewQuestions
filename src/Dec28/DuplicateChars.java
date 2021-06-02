package Dec28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String s = "SahillChopra";
        char[] c = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            if (map.containsKey(c[i]))
                map.put(c[i], map.get(c[i]) + 1);
            else
                map.put(c[i], 1);
        }
        List<String> li = new ArrayList<>();
        for (Character i : map.keySet()) {
            if (map.get(i) > 1)
                System.out.println(i);

        }

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    System.out.print(c[j]);
                    break;
                }
            }
        }

    }
}

