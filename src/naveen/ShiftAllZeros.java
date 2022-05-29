package naveen;

import java.util.Arrays;

public class ShiftAllZeros {
    public static int[] shiftZeroRight(int[] a){
        if(a.length == 1)
            return a;
        int[] newArray=new int[a.length];
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                newArray[count]=a[i];
                count++;
            }
        }
        return newArray;
    }
    public static int[] shiftZeroleft(int[] a){
        if(a.length == 1)
            return a;
        int[] newArray=new int[a.length];
        int count=0;
        for(int i=0; i<a.length; i++){
            if(a[i]==0){
                newArray[count]=a[i];
                count++;
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                newArray[count]=a[i];
                count++;
            }
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] a={1,0,2,5,88,9,0,1,0};
        System.out.println(Arrays.toString(shiftZeroleft(a)));
        int[] b={1};
        System.out.println(Arrays.toString(shiftZeroRight(b)));
    }
}
