package Dec28;

import java.util.HashMap;

public class NumberofWordsUsingHashmap {

    public static void main(String[] args) {
        String s = "Jai Guru Ji Guru Ji k Aashram mai sabka sawgaat hai";
        String[] s1 = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            String temp = s1[i].trim();
            if (map.containsKey(temp)) {

                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }

        }
        System.out.println(map);
    }
}
