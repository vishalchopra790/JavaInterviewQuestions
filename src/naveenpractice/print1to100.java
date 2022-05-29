package naveenpractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class print1to100 {
    public static void main(String[] args) {
        int w='A'/'A';
        String s="..........";
        for(int i=w;i<=s.length()*s.length();i++)
            System.out.println(i);
        for(int i=w;i<=s.length()*s.length();i++)
            System.out.println(i);

        printNum(1,50);

        IntStream.range(1,11).forEach(System.out::println);

        Object[] ob=new Object[100];
        Arrays.fill(ob,new Object(){
            int count=0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }

        });
        System.out.println(Arrays.toString(ob));
    }

    public static void printNum(int start,int end){
        if(start<=end){
            System.out.println(start);
            start++;
            printNum(start,end);
        }
    }
}
