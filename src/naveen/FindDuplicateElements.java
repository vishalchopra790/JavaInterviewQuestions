package naveen;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        //brute force
        String infra[] = {"Vishal", "Sahil", "Ashish", "Naveen", "Vishal", "Sahil"};
        System.out.println("brute force");
        for (int i = 0; i < infra.length; i++) {
            for (int j = i + 1; j < infra.length; j++) {
                if (infra[i].equals(infra[j])) {
                    System.out.println(infra[j]);
                }
            }
        }
        System.out.println("HashSet");
        Set<String> data=new HashSet<>();
        for(String e:infra){
            if(data.add(e)==false) {
                System.out.println(e);
            }
        }

        System.out.println("HashMap");
        Map<String,Integer> map=new HashMap<>();
        for(String e:infra){
            Integer count=map.get(e);
            if(count==null)
                map.put(e,1);
            else
                map.put(e,++count);
        }
        Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
        for(Map.Entry<String, Integer> entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
        System.out.println("Streams");
        Set<String> dataSet=new HashSet<>();
        Set<String> dp= Arrays.asList(infra).stream().filter(e->!dataSet.add(e)).collect(Collectors.toSet());
        System.out.println(dp);

        System.out.println("Streams grouping by");
        Arrays.asList(infra).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1).forEach(e-> System.out.println(e));

        System.out.println("Streams using frequency");
       List<String>li= Arrays.asList(infra);
                li.stream().filter(e->Collections.frequency(li,e)>1).collect(Collectors.toSet()).forEach(e-> System.out.println(e));
    }
}
