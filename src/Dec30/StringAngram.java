package Dec30;

import java.util.Arrays;

public class StringAngram {
    public static void main(String[] args) {
        String s = "listen";
        String s1 = "silentt";
        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);

        System.out.println(Arrays.equals(c, c1));
    }
}
