package naveen2;

public class Leaders {
    public static void findLeaders(int[] num){
        if(num.length==0){

            return;
        }
        if(num.length==1){
            System.out.println(num[0]);
            return;
        }
        int max=num[num.length-1];
        System.out.println(max);
        for(int i=num.length-2;i>=0;i--){
            if(num[i]>max) {
                System.out.println(num[i]);
                max=num[i];
            }
        }

    }
    public static void main(String[] args) {
        int[] n={9,2,8,1,10};
        findLeaders(n);
    }
}
