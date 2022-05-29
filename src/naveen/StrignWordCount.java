package naveen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrignWordCount {
    public static void main(String[] args) {
        String s="thisNaveenAutomationLabsYoutubeSeries";
        int c=0;
        if(Character.isLowerCase(s.charAt(0)))
          c++;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                c++;
        }
        System.out.println(c);
        //1.
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
                count++;
        }
        System.out.println(count);

        //2. Streams

        long count2=s.chars().filter(e->e>=65 && e<=90).count();
        System.out.println(count2);
        long count3=s.chars().filter(Character::isUpperCase).count();
        System.out.println(count3);

        //3.reg exp
        String reg="[A-Z]+";
        Pattern pattern=Pattern.compile(reg);
        Matcher matcher=pattern.matcher(s);
        int count5 = 0;
        while(matcher.find()){
            count5+=matcher.group(0).length();
        }
        System.out.println(count5);

    }
}
