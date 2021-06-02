package MainInterview;

public class PrintNumberWithoutNumber {
    public static void main(String[] args) {

        int s1 = 'a' / 'a';
        String s2 = "..........";

        for (int i = s1; i <= (s2.length() * s2.length()) - 1; i++) {
            System.out.println(i);
        }

        for (int i = s1; i <= 'd'; i++) {
            System.out.println(i);
        }
    }
}
