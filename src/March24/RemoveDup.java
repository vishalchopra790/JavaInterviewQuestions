package March24;

import java.util.HashSet;

public class RemoveDup {
    public static void main(String[] args) {
        String s = "Heeeeeellllooooo";
        System.out.println(remove(s));
    }

    public static String removeDup(String s) {
        HashSet<Character> hash = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            hash.add(s.charAt(i));
        }
        return hash.toString();
    }
    public static String remove(String s) {
        String re="";
        char[] c=s.toCharArray();
        for(char b:c){
            if(!re.contains(String.valueOf(b)))
                re+=b;
        }
        return re;
    }
}

