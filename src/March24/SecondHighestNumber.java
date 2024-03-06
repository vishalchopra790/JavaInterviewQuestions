package March24;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] a={10,13,15,24,56,24,34};
        int largest=0;
        int secondLargest=0;

        for (int j : a) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);

    }
}
