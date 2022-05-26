package naveen;



import java.util.Arrays;
import java.util.stream.IntStream;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Print_1_to_100 {
    public static void main(String[] args) {
        //without using any number
        int one ='A'/'A';
        String s1="..........";

        for(int i=one;i<=(s1.length()*s1.length());i++){
            System.out.println(i);
        }

        for(int i=one;i<='d';i++){
            System.out.println(i);
        }


        // without loop 1. recursive function 2. Java streams

        //printNum(10);


        IntStream.range(1,101).forEach(e-> System.out.println(e));

        // Without using loop and recursion
        //1. Array fill
        Object num[] =new Object[100];
        Arrays.fill(num,new Object(){
         int count =0;
         @Override
            public String toString(){
             return Integer.toString(++count);
         }     });
        System.out.println(Arrays.toString(num));


    }

    public static void printNum(int num) {
        if(num<=100){
            System.out.println(num);
            num++;
            printNum(num);
        }
    }
}
