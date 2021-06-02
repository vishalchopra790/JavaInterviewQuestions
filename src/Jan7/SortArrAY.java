package Jan7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrAY {
    public static void main(String[] args) {
        String[] inputList = {"Vishal", "sahil", "ashish", "Rajesh"};
        List<String> li = Arrays.asList(inputList);

        System.out.println("==========InputList=======================");
        showList(inputList);

        //Sort the Array List
        Collections.sort(li);

        //Display the sortedList
        System.out.println("==========Sorted Lisst===============");
        showList(inputList);

        //Call the sorted List in Case Sensitive Order
        Collections.sort(li, String.CASE_INSENSITIVE_ORDER);
        System.out.println("==========Sorted Lisst===============");
        showList(inputList);
    }

    public static void showList(String[] str) {
        for (String s : str)
            System.out.println(s);
    }
}
