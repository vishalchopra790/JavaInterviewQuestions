package naveen2;

public class isArmStrong {
    public static boolean isArmStrong(int num){
        int sum=0;
        int i=num;
        if(num<0)
            return false;
        if(num>0 && num<=9)
            return true;

        int power=power(num);

        while(num!=0){
            int lastdigit=num%10;
            int factor=1;
            for(int j=0;j<power;j++){
                factor=factor*lastdigit;
            }
            sum+=factor;
            num=num/10;
        }
        return sum == i;

    }

    public static int power(int num){
        int n=0;
        while(num!=0){
            n++;
            num=num/10;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(isArmStrong(54768));
    }
}
