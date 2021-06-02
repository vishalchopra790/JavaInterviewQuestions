package Dec30;

import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        System.out.println(removeDup("heelllllooooo"));
        System.out.println(remove("dell"));

    }

    public static String removeDup(String str) {
        String f = "";
        for (char c : str.toCharArray()) {
            if (!f.contains(String.valueOf(c))) {
                f += c;
            }
        }
        return f;
    }

    public static String remove(String str) {
        String f = "";
        char[] c = str.toCharArray();
        Set<Character> s = new HashSet<>();
        for (char c1 : c) {
            s.add(c1);
        }

        for (Character c2 : s)
            f += c2;

        return f;
    }
}
