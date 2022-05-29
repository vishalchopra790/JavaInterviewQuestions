package naveen;

import java.util.function.IntPredicate;

public class VowelsCount {

    public static void main(String[] args) {
        String s="aeiou";
        int count =0;
        for(char c:s.toCharArray()){
            if(isVowel(c))
                count++;
        }
        System.out.println(count);

        IntPredicate i= new IntPredicate() {
            @Override
            public boolean test(int t) {
                return t=='a' || t=='e' || t=='i' || t=='o' || t=='u' || t=='A' || t=='E' || t=='I' || t=='O' || t=='U';
            }
        };
       long cou= s.chars().filter(i).count();
        System.out.println(cou);
    }
    public static boolean isVowel(char t){
        return t=='a' || t=='e' || t=='i' || t=='o' || t=='u' || t=='A' || t=='E' || t=='I' || t=='O' || t=='U';
    }
}
