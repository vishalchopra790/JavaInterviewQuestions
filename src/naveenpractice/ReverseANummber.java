package naveenpractice;

public class ReverseANummber {

    public static void reverse(int num){
        int rev=0;
        if(num<10){
            System.out.println(num);
            return;
        }else {
            rev=num%10;
            System.out.print(rev);
            num=num/10;
            reverse(num);
        }

    }

    public static void main(String[] args) {
     reverse(125);
    }
}
