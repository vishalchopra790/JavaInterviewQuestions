package Dec30;

import java.util.Arrays;

public class SecondLNum {
    public static void main(String[] args) {
        int[] a = {2, 3, 3, 105, 4, 3, 99, 100};
        System.out.println(Max(a));
        System.out.println(max(a));

    }

    public static int Max(int[] arr) {
        Arrays.sort(arr);
        //return arr[arr.length-2];
        return arr[1];
    }

    public static int max(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
}
