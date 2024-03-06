package naveen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findDuplicateChars {

    public static void dupElements(String s){
        Map<Character, Integer> map = new HashMap<>();
        char[] c=s.toCharArray();
        for(Character s1:c){
            if(map.containsKey(s1))
                map.put(s1,map.get(s1)+1);
            else
                map.put(s1,1);

        }
        Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
        for(Map.Entry<Character,Integer> m:entrySet){
            if(m.getValue()>1){
                System.out.println(m.getKey()+" : "+m.getValue());
            }
        }
    }
    public static void main(String[] args) {
         dupElements("test string");
    }
}
