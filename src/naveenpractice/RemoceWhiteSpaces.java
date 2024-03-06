package naveenpractice;

import com.sun.deploy.util.StringUtils;

public class RemoceWhiteSpaces {
    public static void main(String[] args) {
        String s= "     testing     ";
       // s=  s.replaceAll("\\s+","");
        //s=  s.replace("\\s+","");
        //s= StringUtils.trimWhitespace(s);
        String news="";
        for (int i=0; i<s.length();i++){
            if((s.charAt(i)!=' ')&&(s.charAt(i)!='\t'))
                news+=s.charAt(i);
        }
        System.out.println(news);
    }
}
