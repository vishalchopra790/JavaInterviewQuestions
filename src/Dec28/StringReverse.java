package Dec28;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Automation";
        StringBuilder str = new StringBuilder();
        str.append(s);
        str = str.reverse();
        //System.out.println(str);

        /// method 2
        char s1[] = s.toCharArray();
        for (int i = s1.length - 1; i >= 0; i--) {
            System.out.println(s1[i]);
        }
        // method 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        String s2 = sc.nextLine();
        String[] token = s2.split("");
        for (int i = token.length - 1; i >= 0; i--) {
            System.out.print(token[i] + "");
        }
        // method 4
        String reverse = "";
        int length = s2.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + s2.charAt(i);
        }
        System.out.print(reverse);
    }

}
