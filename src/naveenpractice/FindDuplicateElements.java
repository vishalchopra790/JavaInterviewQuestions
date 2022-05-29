package naveenpractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        String infra[] = {"Vishal", "Sahil", "Ashish", "Naveen", "Vishal", "Sahil"};
        Map<String,Integer> map=new HashMap<>();
        for(String s:infra){
            Integer count=map.get(s);
            if(count==null)
                map.put(s,1);
            else
                map.put(s,++count);

        }
        Set<Map.Entry<String,Integer>> entry= map.entrySet();
        for(Map.Entry<String,Integer> e:entry){
            if(e.getValue()>1)
                System.out.println(e.getKey());
        }

        Set<String> set=new HashSet<>();
        for(String s:infra){
            if(!set.add(s))
                System.out.println(s);
        }

        //brute force
        for(int i=0;i<infra.length;i++){
            for(int j=i+1;j<infra.length;j++){
                if(infra[j].equals(infra[i]))
                    System.out.println(infra[i]);
            }
        }
        //Streams
        System.out.println("stream");
        Set<String> data=new HashSet<>();
        Set<String> s= Arrays.stream(infra).filter(e-> !data.add(e)).collect(Collectors.toSet());
        System.out.println(s);

        System.out.println("frequency");
        List<String>li= Arrays.asList(infra);
        li.stream().filter(e->Collections.frequency(li,e)>1).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("grouping");
        Arrays.stream(infra).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1).forEach(System.out::println);
    }
}
