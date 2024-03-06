package March24;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any keyword");
        String val=sc.nextLine();
        String reverse="";
        for(int i=val.length()-1; i>=0; i--) {
            reverse=reverse+val.charAt(i);
        }
        if(val.equals(reverse))
            System.out.println("p");
        else
            System.out.println("no");
    }
}
