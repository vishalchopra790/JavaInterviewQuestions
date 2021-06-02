package MainInterview;

import com.google.common.base.CharMatcher;

import java.util.function.IntPredicate;

public class VowelCount {

    public static void main(String[] args) {
        String s = "Vishal";
        int count = 0;
        for (int x = 0; x < s.length(); x++) {
            if (isVowel(s.charAt(x))) {
                count++;
            }
        }
        System.out.println(count);

        System.out.println("------------Java 8 Streams--------------");
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                        t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
            }
        };
        long countS = s.chars().filter(vowel).count();
        System.out.println(countS);


        System.out.println("-----Guava Jar -------------");
        int voCount= CharMatcher.anyOf("aeiouAEIOU").countIn(s);
        System.out.println(voCount);
    }

    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
    }
}
