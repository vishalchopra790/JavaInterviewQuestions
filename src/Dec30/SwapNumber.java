package Dec30;

public class SwapNumber {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;

        i = j - i;//i=5
        j = i + j;
        i = i - j;
        System.out.println(j);
        System.out.println(i);
    }
}
