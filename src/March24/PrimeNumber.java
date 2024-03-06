package March24;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any keyword");
        int val=sc.nextInt();

       /* if(val%2==0)
            System.out.println("prime");
        else
            System.out.println("odd");*/
        System.out.println(isPrime(val));

    }
    public static Boolean isPrime(int v) {
        if (v <= 1)
            return false;
        for (int j = 2; j <v/2; j++) {
            if (v % j == 0)
                return false;
        }
        return true;
    }

}
