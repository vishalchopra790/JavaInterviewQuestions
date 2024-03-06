package naveen2;

import java.util.Arrays;

public class Anagram {
    public static  boolean checkAnagram(String st1,String st2){
       String s1= st1.replaceAll("\\s+","");
        String s2= st2.replaceAll("\\s+","");
        if(s1.length()!=s2.length())
            return false;
        else{
          char[] c1=  s1.toLowerCase().toCharArray();
          char[] c2=  s2.toLowerCase().toCharArray();
          Arrays.sort(c1);
          Arrays.sort(c2);
          return  Arrays.equals(c1,c2);
        }
    }
    public static  boolean checkAnagramWFunction(String st1,String st2){
        String s1= st1.replaceAll("\\s+","");
        String s2= st2.replaceAll("\\s+","");
        if(s1.length()!=s2.length())
            return false;
        else{
            char[] c1=  s1.toLowerCase().toCharArray();
            char[] c2=  s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return  Arrays.equals(c1,c2);
        }
    }
    public static void main(String[] args) {
        System.out.println(checkAnagram("listen","silent "));
        System.out.println(checkAnagram("joy","yoj"));
    }
}
