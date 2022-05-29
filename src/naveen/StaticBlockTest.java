package naveen;

public class StaticBlockTest {

    public static void main(String[] args) {
        System.out.println(Test.x);
    }
}
class Test{
    public static final int x =100;
    static{

        System.out.println("zxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}