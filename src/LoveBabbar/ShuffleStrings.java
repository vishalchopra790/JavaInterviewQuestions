package LoveBabbar;

import java.util.Arrays;

public class ShuffleStrings {

    static boolean checkLength(String s1,String s2,String result) {
        if(s1.length()+s2.length()!=result.length())
            return false;
        else
            return true;
    }

    static String sortString(String str){
        char[] c=str.toCharArray();
        Arrays.sort(c);

        str= String.valueOf(c);
        return str;
    }

    static boolean shuffle(String s1,String s2,String result){
        s1=sortString(s1);
        s2=sortString(s2);
        result=sortString(result);

        int i = 0;
        int j=0;
        int k=0;
        while(k!=result.length()){
            if(i<s1.length() && s1.charAt(i)==result.charAt(k))
                i++;
            else if(j<s2.length()&&s2.charAt(j)==result.charAt(k))
                j++;
            else
                return false;
            k++;
        }
        if(i < s1.length()||j < s2.length())
            return false;
        return true;
    }

    public static void main(String[] args) {
        String x="XY";
        String y="12";
        String[] result = {"X1Y2","XX12"};
        for(String s:result) {
            if (checkLength(x, y, s) && shuffle(x, y, s))
                System.out.println("Valid shuffle");
            else
                System.out.println("invalid");
        }

    }
}
