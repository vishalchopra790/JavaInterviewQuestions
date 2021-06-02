package Jan6;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(dup1("Helllllo"));
    }

    public static String dup(String s) {
        String s1 = "";
        for (char ch : s.toCharArray()) {
            if (!s1.contains(String.valueOf(ch))) {
                s1 += ch;
            }
        }
        return s1;
    }

    public static String dup1(String s) {
        String dup = "";
        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : ch) {
            set.add(c);
        }
        for (Object s2 : set)
            dup += s2;

        return dup;
    }
}


