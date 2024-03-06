package March24;

public class RevArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int j = a.length - 1;
        for (int i = 0; i < a.length/2; i++) {
            int temp=a[i];
            a[i]=a[j-i];
            a[j-i]=temp;
        }
        for (int i = 0; i < a.length;i++)
            System.out.println(a[i]);
    }
}
