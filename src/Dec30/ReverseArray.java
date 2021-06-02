package Dec30;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        RevArray(a);
    }


    public static void RevArray(int[] arrNum) {
        //we will use two pointers one we will start from start and one from the end

        //pointer that start from back

        int j = arrNum.length - 1;

        for (int i = 0; i < arrNum.length / 2; i++) {


            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }


        System.out.println(Arrays.toString(arrNum));

    }
}
