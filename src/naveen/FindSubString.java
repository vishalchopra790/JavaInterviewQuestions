package naveen;

public class FindSubString {
    public static void main(String[] args) {
        System.out.println(isSubString("naveen automation","naveen"));
        System.out.println(isSubString("naveen automation","vishal"));
    }
    public static boolean isSubString(String main,String sub) {
        return main.matches("(.*)"+sub+"(.*)");
    }
}
