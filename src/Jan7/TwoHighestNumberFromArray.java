package Jan7;

public class TwoHighestNumberFromArray {

    public static void main(String[] args) {
        int[] i = {2, 5, 6, 5, 3, 65, 6, 43, 3, 4, 67, 54, 78};
        int maxone = 0;
        int maxtwo = 0;

        for (int n : i) {
            if (n > maxone) {
                maxtwo = maxone;
                maxone = n;

            } else if (n > maxtwo) {
                maxtwo = n;
            }
        }
        System.out.println(maxone);
        System.out.println(maxtwo);
    }
}
