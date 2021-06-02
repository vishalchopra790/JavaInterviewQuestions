package Jan6;

import java.util.Arrays;

public class Combination {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 3, 2, 2, 1, 45, 43, 32, 34, 34, 54, 61, 16, 16, 20, 12};
        System.out.println(Arrays.toString(sum(a, 32)));
    }

    public static int[] sum(int[] a, int b) {
        int[] sumNumbers = new int[2];

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    sumNumbers[0] = a[i];
                    sumNumbers[1] = a[j];
                }
            }
        }
        return sumNumbers;
    }
}