package NewConcept;

public class Leader {
    static void findLeader(int[] num){

        if(num.length==1){
            System.out.println(num[0]);
            return;
        }
        if(num.length==0){
            return;
        }
        int max=num[num.length-1];
        System.out.print(max);

        for(int i=num.length-2; i>=0; i--){
            if(num[i]>max){
                System.out.print(num[i]);
                max=num[i];
            }
        }
    }

    public static void main(String[] args) {
        int num[]={24,4,2,5,12};
        findLeader(num);
    }
}
