package naveenpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChracters {
    public static void main(String[] args) {
      dupCheck("AbaBaA");
    }
    public static void dupCheck(String s){
        if(s==null){
            System.out.println("null");
            return ;
        }
        if(s.isEmpty()){
            System.out.println("empty");
            return ;
        }
        if(s.length()==1){
            System.out.println("Single");
            return ;
        }

        char[] c= s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(Character s1:c){
            Integer count=map.get(s1);
            if(count==null)
                map.put(s1,1);
            else
                map.put(s1,++count);

        }
        Set<Map.Entry<Character,Integer>> entry= map.entrySet();
        for(Map.Entry<Character,Integer> e:entry){
            if(e.getValue()>1)
                System.out.println(e.getKey());
        }



    }
}
