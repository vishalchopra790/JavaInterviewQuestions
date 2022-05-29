package naveen2;

public class ReverseANumber {
    public static void main(String[] args) {
        int n=12345;
                /*while(n>0){
                    int rev=n%10;
                    System.out.print(rev);
                    n=n/10;
                }*/
        rev(7896656);
    }
    public static void rev(int num){
        if(num<10){
            System.out.println(num);
            return;
        }else{
            System.out.print(num%10);
            rev(num/10);
        }
    }
}
