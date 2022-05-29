package naveen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MissingElement {
    public static void main(String[] args) {
        int num[]={1,2,3,5};
        //System.out.println(findMissingNumber(num,5));
        findMultipleMissing(num,1,5);
    }
    public static int findMissingNumber(int num[],int total){
        int expSum=total*((total+1))/2;
        int actualSum=0;
        for(int i:num)
            actualSum+=i;

        return expSum-actualSum;
    }
    public static void findMultipleMissing(int[] num, int start, int end){
        ArrayList<Integer> missing = null;
        for(int i=start;i<=end;i++){

             missing= new ArrayList<Integer>();
            missing.add(i);

        }

    }
}
