package MainInterview;

public class AlphabetPattern {
    public static void main(String[] args) {
        int alpha=65;
        for(int i=0;i<=10;i++){
            for (int j=0;j<=i;j++){
                System.out.print(" "+(char) ( alpha+j));
            }
            System.out.println();
        }
        for(int i=0;i<=10;i++){
            for (int j=10;j>i;j--){
                System.out.print(" "+(char)(75-j));
            }
            System.out.println();
        }
    }
}
