package naveenpractice;

public class MissingElement {
    public static void main(String[] args) {
        int[] num={1,2,3,5,7};
        MissingElement(num,7);

    }
    public static void MissingElement(int[] num,int total ){
        int expTotal=total*(total+1)/2;
        int tot=0;
        for(int n:num){

            tot+=n;
        }
        System.out.println(expTotal-tot);
    }
}
