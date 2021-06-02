package Jan6;

public class Fabnocci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        for (int i = 0; i <= 12; i++) {
            System.out.println(a + " ");

            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
