package NewConcept;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<>();
        a.add("Vishal");
        a.add("Vishu");
        a.add("Sahil");
       long c= a.stream().filter(s->s.startsWith("V")).count();
        System.out.println(c);

        Stream.of("Vishal","Vishu","Sahil").filter(s->
            s.startsWith("V")
        ).forEach(System.out::println);

        Stream.of("Vishal","Vishu","Sahil").filter(s->s.endsWith("l")).sorted().map(String::toUpperCase).forEach(System.out::println);

        //merge 2 array list


        //any match
        Stream.of("Vishal", "Vishu", "Sahil").anyMatch(s -> s.equalsIgnoreCase("vishal"));
        boolean flag= true;
        System.out.println(flag);

        //collect

        Set<String> v=Stream.of("Vishal","Vishal","Vishu","Sahil").filter(s->s.startsWith("V")).collect(Collectors.toSet());
        System.out.println(v);

    }
}
