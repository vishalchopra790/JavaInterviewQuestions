package naveen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChracters {
    public static void main(String[] args) {
        CheckString(" ");
    }
    public static void CheckString(String s){
        if(s == null ) {
            System.out.println("Null string");
            return;
        }
        if(s.equals(" ")) {
            System.out.println("Single white space");
            return;
        }
        if(s.length() == 1 ) {
            System.out.println("Single char string");
            return;
        }

        if(s.isEmpty() ) {
            System.out.println("Empty string");
            return;
        }
        char words[]=s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(Character m:words){
            Integer count=map.get(m);
            if(count==null)
                map.put(m,1);
            else
                map.put(m,++count);

        }
       Set<Map.Entry<Character,Integer>> entry= map.entrySet();
        for(Map.Entry<Character,Integer> e:entry){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }
    }


}
