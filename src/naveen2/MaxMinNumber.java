package naveen2;

public class MaxMinNumber {

    public static int findMaxNumber(int a,int b,int c){
        int max=0;
        while(a>0||b>0||c>0){
            a--;
            b--;
            c--;
            max++;
        }
        return max;
    }
    public static int findMinNumber(int a,int b,int c){
        int min=0;
        while(a>0&&b>0&&c>0){
            a--;
            b--;
            c--;
            min++;
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findMaxNumber(0,1,0));
        System.out.println(findMinNumber(0,1,0));
        System.out.println(findMinNumber(1,1,6));
    }
}
