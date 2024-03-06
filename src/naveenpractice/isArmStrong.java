package naveenpractice;

public class isArmStrong {
    public static void main(String[] args) {
        System.out.println(arm(1534));  ;
    }
    public static int power(int num){
        int n=0;
        while(num!=0){
            n++;
            num=num/10;
        }
        return n;

    }
    public static boolean arm(int num){
        int sum=0;
        int copynum=num;
        int power=power(num);
        while(num!=0) {
            int lastdigit = num % 10;
            int factor=1;
            for(int i=0;i<power;i++){
                factor=factor*lastdigit;
            }
            sum+=factor;
            num=num/10;
        }
        return sum==copynum;
    }
}
