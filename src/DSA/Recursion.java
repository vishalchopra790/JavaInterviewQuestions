package DSA;

public class Recursion {
  static int a[]={1,4,7,3,4,5};
    public static void main(String[] args){
        System.out.println(sumofDigits(a.length-1));;
        System.out.println(factorial(5));;
        }

    private static int sumofDigits(int n) {
        if(n==0)
            return a[n];


        return a[n]+ sumofDigits(n-1);
    }

    private static int factorial(int n) {
        if(n==1)
            return 1;


        return n* factorial(n-1);
    }
}

