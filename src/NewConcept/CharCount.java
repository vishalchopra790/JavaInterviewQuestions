package NewConcept;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void getCharCount(String name){
        Map<Character,Integer> map=new HashMap<>();
        char[] str=name.toCharArray();
        for(char c:str) {
            //if (String.valueOf(c).is()) {
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }else{
                    map.put(c,1);
                }
            //}
        }
        System.out.println(name+" "+map);
    }
    public static void main(String[] args) {
getCharCount("test ");
    }
}
