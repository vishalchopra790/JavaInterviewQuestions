package naveen2;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("total number of rows");
        int row=sc.nextInt();
        System.out.println("total number of cols");
        int col=sc.nextInt();
        System.out.println("enter matrix data");
        int data[][] =new int[row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                data[i][j]=sc.nextInt();
            }
        }
        //print matrix=
        /*for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(data[i][j]+" ");;
            }
            System.out.println();
        }*/
        /*for(int[] r:data){
            for(int x:r) {
                System.out.print(x + " ");
            }
            System.out.println();
        }*/

        /*for(int[] r:data){
            System.out.println(Arrays.toString(r));
        }*/
        //System.out.print(Arrays.deepToString(data));

        Arrays.stream(data).forEach(e->{
            Arrays.stream(e).forEach(j-> System.out.print(j+" "));
            System.out.println();
        });

    }
}
