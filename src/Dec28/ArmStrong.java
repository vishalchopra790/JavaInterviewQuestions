package Dec28;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int r = 0, a, temp = num;

        while (num > 0) {
            a = num % 10;
            num = num / 10;
            r = r + (a * a * a);
        }
        if (temp == r)
            System.out.println("Armstromg");
        else
            System.out.println("Not Armstrong");


    }
}