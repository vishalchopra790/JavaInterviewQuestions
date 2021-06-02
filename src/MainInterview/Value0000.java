/*
 * Copyright (c) Vishal
 */

package MainInterview;

import java.util.Arrays;

public class Value0000 {

    public static int[] shiftZeroRight(int[] a) {
        if (a.length == 1) {
            return a;
        }
        int[] b = new int[a.length];
        int count = 0;
        for (int number : a) {
            if (number != 0) {
                b[count] = number;
                count++;
            }
        }
        return b;
    }

    public static int[] shiftZeroLeft(int[] a) {
        if (a.length == 1)
            return a;
        int[] b = new int[a.length];
        int count = 0;
        for (int number : a) {
            if (number == 0) {
                b[count] = number;
                count++;
            }
        }
        for (int number : a) {
            if (number != 0) {
                b[count] = number;
                count++;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] i = new int[]{90, 0, 5, 43, 0, 6};
        System.out.println(Arrays.toString(shiftZeroRight(i)));

        i = new int[]{90, 0, 0, 0, 0, 6};
        System.out.println(Arrays.toString(shiftZeroRight(i)));
        System.out.println(Arrays.toString(shiftZeroLeft(i)));

        Arrays.sort(i);
        System.out.println(Arrays.toString(i));
    }
}
