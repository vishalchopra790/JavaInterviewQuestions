package naveenpractice;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdditionandSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("rows");
        int rows = sc.nextInt();
        System.out.println("cols");
        int cols = sc.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];
        System.out.println("data1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("data1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        System.out.println("data");
        for(int[] r:matrix1){
            System.out.println(Arrays.toString(r));
        }
        for(int[] r:matrix2){
            System.out.println(Arrays.toString(r));
        }

        //sum
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j <cols; j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("result");
        for(int[] r:result){
            System.out.println(Arrays.toString(r));
        }
    }
}
