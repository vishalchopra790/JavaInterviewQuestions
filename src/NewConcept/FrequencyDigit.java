package NewConcept;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FrequencyDigit {

   public static void  getDigitCount(long number){
       if(String.valueOf(number).length()==1){
           System.out.println(number +" : "+1);
           return;
       }
       HashMap<Long, Integer> digitMap=new HashMap<>();
       while(number!=0){
           long lastdigit=number%10;
           if(digitMap.containsKey(lastdigit))
               digitMap.put(lastdigit,digitMap.get(lastdigit)+1);
           else
               digitMap.put(lastdigit,1);

           number=number/10;
       }
       Set<Long> set = digitMap.keySet();
       for(Long l:set)
           System.out.println(l+" : "+digitMap.get(l));
   }

    public static void main(String[] args) {
        getDigitCount(11122);
    }
}
