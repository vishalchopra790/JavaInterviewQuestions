package Dec30;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            rev = rem + (rev * 10);
            num = num / 10;

        }
        return rev == temp;
    }
}
