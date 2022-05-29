package naveen;

public class Star {
    public static void main(String[] args) {
        //straight
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        //reverse
        //////////////////////////////////////////////////////
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //// Printing ALpha pattern
        int alpha=65;
        for(int i=0;i<=6;i++){
            for (int j =6;j>i;j--){
                System.out.print((char)(alpha+j)+" ");
            }
            System.out.println();
        }

        /*   A
           B B
           C CC  */

        for(int i=0;i<=6;i++){
            for (int j =0;j<=i;j++){
                System.out.print((char)(alpha+i)+" ");
            }
            System.out.println();
        }
    }
}