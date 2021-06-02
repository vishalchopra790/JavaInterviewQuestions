/*
 * Copyright (c) Vishal
 */

package MainInterview;

import java.util.Arrays;
import java.util.BitSet;

public class Print100WithoutArray {

    public static void main(String[] args) {

        Object num[]=new Object[100];

        Arrays.fill(num,new Object(){
            int count =0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));



        //2/ Bitset
        String s=new BitSet(){{set(1,101);}}.toString();
        System.out.append(s,1,s.length());
    }
}
