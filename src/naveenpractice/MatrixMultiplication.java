package naveenpractice;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("rows for first matrix");
        int firstrows = sc.nextInt();
        System.out.println("cols for first and rows for second");
        int colsfirstrowsecond = sc.nextInt();
        System.out.println("cols for second");
        int colsforsecond = sc.nextInt();
        int[][] matrix1 = matrixCreation(firstrows, colsfirstrowsecond);
        int[][] matrix2 = matrixCreation(colsfirstrowsecond, colsforsecond);
        int[][] result = new int[firstrows][colsforsecond];
        System.out.println("matrix1");
        for(int[] r:matrix1){
            System.out.println(Arrays.toString(r));
        }
        System.out.println("matrix2");
        for(int[] r:matrix2){
            System.out.println(Arrays.toString(r));
        }

        for (int i=0;i<firstrows;i++){
            for(int j=0;j<colsforsecond;j++){
                for(int k=0;k<colsfirstrowsecond;k++){
                    result[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }

        }
        System.out.println("result");
        for(int[] r:result){
            System.out.println(Arrays.toString(r));
        }

    }
}
