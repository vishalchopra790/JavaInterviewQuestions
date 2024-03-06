package March24;

public class SwapNumbers {
    public static void main(String[] args) {
        int a=4;
        int b=10;

        /*int temp=a;
        a=b;
        b=temp;*/
        a = a+b; //14
        b =a-b; //14-10=4
        a=a-b;

        System.out.println("a: "+a+" b: "+b);
    }
}
