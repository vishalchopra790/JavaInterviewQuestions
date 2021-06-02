/*
 * Copyright (c) Vishal
 */

package MainInterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWordCount {
    public static void main(String[] args) {
        String str = " thishVishalChopraSahilKhan";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);

        int count2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                count2++;
            }
        }
        System.out.println(count2);

        int count3 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count3++;
            }
        }
        System.out.println(count3);

        //4
        long count4 = str.chars().filter(e -> e >= 65 && e <= 90).count();
        System.out.println(count4);

        //5.
        System.out.println(str.chars().filter(e -> Character.isUpperCase(e)).count());

        //6
        String reg = "[A-Z]+";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);
        int count5 = 0;
        while (matcher.find()) {
            count5 += matcher.group(0).length();
        }
        System.out.println(count5);

        //7
        int c5 = 0;
        if (Character.isLowerCase(str.trim().charAt(0))) {
            c5++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                c5++;
            }
        }
        System.out.println(c5);
    }
}
