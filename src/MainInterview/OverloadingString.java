package MainInterview;

public class OverloadingString {
    public static void main(String[] args) {
        test(null);

    }

    public static void test(Object s) {
        System.out.println("Object Argument");
    }
   /* public static void test(String s){
        System.out.println("String Argument");
    }*/
}
