package naveen2;

import java.util.Arrays;
import java.util.Scanner;

public class MAtrxAddition {
    public static int[][] matrixCreation(int row,int col){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix data");
        int[][] data =new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                data[i][j]=sc.nextInt();
            }
        }
        return data;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("total number of rows");
        int row=sc.nextInt();
        System.out.println("total number of cols");
        int col=sc.nextInt();
        int[][] matrix1 = matrixCreation(row, col);
        int[][] matrix2 = matrixCreation(row, col);
        int[][] resulltMatrix = new int[row][col];
        System.out.println("matrix1");
        for(int[] r:matrix1){
            System.out.println(Arrays.toString(r));
        }
        System.out.println("matrix2");
        for(int[] r:matrix2){
            System.out.println(Arrays.toString(r));
        }
        System.out.println("result matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                resulltMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(resulltMatrix[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("subtraction result matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                resulltMatrix[i][j]=matrix1[i][j]-matrix2[i][j];
                System.out.print(resulltMatrix[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
