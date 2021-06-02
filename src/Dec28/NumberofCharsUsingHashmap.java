package Dec28;

import java.util.HashMap;

public class NumberofCharsUsingHashmap {

    public static void main(String[] args) {
        String s = "Jai Guru Ji";
        String[] s1 = s.split(" ");

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length; i++) {
            if (map.containsKey(s1[i])) {
                int count = map.get(s1[i]);
                map.put(s1[i], count + 1);
            } else {
                map.put(s1[i], 1);
            }

        }
        System.out.println(map);
    }
}
