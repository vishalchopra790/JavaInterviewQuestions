package NewConcept;

import java.util.*;

public class CompareTwoList {

    public static void main(String[] args) {
        test1();
        repeated();
    }
    public static void test1() {
        Collection<String> listOne = Arrays.asList("milan","dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta");
        Collection<String> listTwo = Arrays.asList("hafil", "iga", "binga", "mike", "dingo");

        Collection<String> similar = new HashSet<>(listOne);
        Collection<String> different = new HashSet<>();
        different.addAll(listOne);
        different.addAll(listTwo);

        similar.retainAll(listTwo);
        different.removeAll(similar);
        System.out.printf("One:%s%n Two:%s%n Similar:%s%n Different:%s%n",listOne,listTwo,similar,different);


    }

    public static boolean test(){
        Collection<String> listOne = Arrays.asList("milan","dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta");
        Collection<String> listTwo = Arrays.asList("milan","dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta");

        return listOne.containsAll(listTwo) && listOne.size() == listTwo.size();
    }

    public static void repeated(){
        Collection<String> listOne = new ArrayList<>(Arrays.asList("milan","dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta"));
        Collection<String> listTwo = new ArrayList<>(Arrays.asList("hafil", "iga", "binga", "mike", "dingo"));

        listOne.retainAll( listTwo );
        System.out.println( listOne );
    }
}
