package Dec28;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;

        int temp;
        /// using thirsd variable
//        temp=a;
//        a=b;
//        b=temp;

        System.out.println(a);
        System.out.println(b);

        // without using third variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
