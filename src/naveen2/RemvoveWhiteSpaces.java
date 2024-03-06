package naveen2;


import com.sun.deploy.util.StringUtils;

public class RemvoveWhiteSpaces {
    public static void main(String[] args) {
        String s="   The password  ";
        //System.out.println(s.trim());
        System.out.println(s.replace(" ",""));
        System.out.println(s.replaceAll("\\s+",""));
        System.out.println(StringUtils.trimWhitespace(s));

        String newS="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)!=' ') && (s.charAt(i)!='\t'))
                newS=newS+s.charAt(i);
        }
        System.out.println(newS);
    }
}
