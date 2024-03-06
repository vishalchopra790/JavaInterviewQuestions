package naveenpractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatNumberCount {
    public static void numberCount(long l){
        Map<Long, Integer> map=new HashMap<>();
        while(l!=0){
            long lastdigit=l%10;
            if(map.containsKey(lastdigit))
                map.put(lastdigit,map.get(lastdigit)+1);
            else
                map.put(lastdigit,1);
            l=l/10;

        }
        Set<Long> set = map.keySet();
        for(Long li:set){
            System.out.println(li+":"+map.get(li));
        }

    }

    public static void main(String[] args) {
        numberCount(1223345555433333l);
    }
}
