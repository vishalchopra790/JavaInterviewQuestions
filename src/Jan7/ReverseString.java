package Jan7;

public class ReverseString {

    public static void main(String[] args) {


        String s = "Hello";
        String s1 = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder(s);
        s2.reverse();
        System.out.println(s2);


        char[] c = s1.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(c[i]);
        }
    }
}