package March24;

import java.util.HashMap;

public class NumberOfWordsUsingMap {
    public static void main(String[] args) {
        String s ="Jai Mata Di Di Di";
        String[] s1=s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String value : s1) {
            String temp = value.trim();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        for(String s3:map.keySet()){
            if(map.get(s3)>1)
                System.out.println(s3);
        }
    }
}
