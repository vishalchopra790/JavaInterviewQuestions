package Dec30;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseStr("Jai Mata Di") + "");
    }


    public static String reverseStr(String str) {
        String[] s1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--)
            sb.append(s1[i]);

        return sb.toString();
    }
}
