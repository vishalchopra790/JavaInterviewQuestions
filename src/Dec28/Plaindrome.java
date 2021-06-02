package Dec28;

import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner s = new Scanner(System.in);
        original = s.nextLine();
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)) {
            System.out.println("Word is  palindrome");
        } else {
            System.out.println("Word is not");
        }
    }
}
