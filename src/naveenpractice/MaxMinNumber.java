package naveenpractice;

public class MaxMinNumber {
    public static int findMax(int a,int b,int c){
        int max =0;
        while(a>0||b>0||c>0){
            a--;
            b--;
            c--;
            max++;
        }
        return max;
    }
    public static int findMin(int a,int b,int c){
        int max =0;
        while(a>0&&b>0&&c>0){
            a--;
            b--;
            c--;
            max++;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(findMax(1,2,5));
        System.out.println(findMin(1,2,5));
    }
}
