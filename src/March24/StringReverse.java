package March24;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        // Method 1 using string builder
        String s="Vishal";
        StringBuilder str=new StringBuilder();
        str.append("Vishal");
        str.reverse();
        //System.out.println(str);


        // Method 2 char method
        char[] c=s.toCharArray();
        for(int i=s.length()-1;i>=0;i--){
            //System.out.print(c[i]);
        }

        //Method 3 Scanner Method
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter any keyword");
        String p=sc.nextLine();
        String[] arr=p.split("");
        for(int i=p.length()-1;i>=0;i--){
            System.out.print(arr[i]);
        }
*/
        //Method 4 Concat
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);

    }
}
