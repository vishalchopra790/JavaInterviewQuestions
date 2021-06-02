package Dec30;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("masama"));
    }

    public static Boolean palindrome(String str) {
        int j = str.length() - 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(j - i))
                return false;
        }
        return true;
    }
}
