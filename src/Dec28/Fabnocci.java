package Dec28;

import java.util.Scanner;

public class Fabnocci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times");
        int num = in.nextInt();
        for (int i = 1; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }

    }
}
