package Jan7;

import java.util.StringTokenizer;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s = "Jai Guru Ji Shukarana Guru Ji";
        StringTokenizer substr = new StringTokenizer(s, " ");
        StringBuffer s1 = new StringBuffer();

        while (substr.hasMoreElements())
            s1.append(substr.nextElement()).append(" ");

        System.out.println(s1.toString().trim());
    }
}

