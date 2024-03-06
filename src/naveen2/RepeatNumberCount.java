package naveen2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatNumberCount {
    public static void digitCount(long number){
        Map<Long, Integer> map=new HashMap<>();
        while(number!=0){
            long lastdigit=number%10;
            if(map.containsKey(lastdigit))
                map.put(lastdigit,map.get(lastdigit)+1);
            else
                map.put(lastdigit,1);
         number=number/10;
        }
       Set<Long> keys=map.keySet();
        for(Long l:keys)
            System.out.println(l+": "+map.get(l));
    }
    public static void main(String[] args) {
        digitCount(1431324444);
    }
}
