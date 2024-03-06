package naveenpractice;

public class Leaders {
    public static void main(String[] args) {
        int n[]={10,9,6,8,1,4};
        findLeader(n);

    }
    public static void findLeader(int[] num){
        if(num.length==0)
            return;
        if(num.length==1) {
            System.out.println(num[0]);
            return;
        }
        int max=num[num.length-1];
        System.out.println(max);
        for(int i=num.length-2;i>=0;i--){
            if(num[i]>max) {
                System.out.println(num[i]);
                max = num[i];
            }
        }

    }
}
