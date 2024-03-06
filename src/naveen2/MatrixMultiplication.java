package naveen2;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
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
        System.out.println("total number of rows in first matrix");
        int rowinFirst=sc.nextInt();
        System.out.println("total number of cols in first matrix or rows second matrix");
        int colinFirstAndRowsInSecond=sc.nextInt();
        System.out.println("total number of cols in second matrix");
        int colsInSecond=sc.nextInt();
        int[][] matrix1 = matrixCreation(rowinFirst, colinFirstAndRowsInSecond);
        int[][] matrix2 = matrixCreation(colinFirstAndRowsInSecond, colsInSecond);
        int[][] resulltMatrix = new int[rowinFirst][colsInSecond];

        System.out.println("matrix1");
        for(int[] r:matrix1){
            System.out.println(Arrays.toString(r));
        }
        System.out.println("matrix2");
        for(int[] r:matrix2){
            System.out.println(Arrays.toString(r));
        }
        for (int i=0;i<rowinFirst;i++){
            for(int j=0;j<colsInSecond;j++){
                for(int k=0;k<colinFirstAndRowsInSecond;k++){
                    resulltMatrix[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }

        }
        for(int[] r:resulltMatrix){
            System.out.println(Arrays.toString(r));
        }
    }
}
