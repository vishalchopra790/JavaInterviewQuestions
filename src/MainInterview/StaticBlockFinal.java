package MainInterview;

public class StaticBlockFinal {
    public static void main(String[] args) {
        System.out.println(Main.x);
    }


}

class Main {
    public static int x = 100;

    static {
        System.out.println("hello");
    }

}