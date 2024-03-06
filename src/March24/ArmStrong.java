package March24;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int temp=num;
        int a=0;
        int r=0;

        while(num>0){
            a=num%10;
            num=num/10;
            r=r+(a*a*a);

        }
        if(temp==r)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}
