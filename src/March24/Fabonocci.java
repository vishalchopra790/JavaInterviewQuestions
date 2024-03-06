package March24;

public class Fabonocci {

    public static void main(String[] args) {
        int a=0;
        int b =1;

        int c=5;
        for(int i=0; i<c; i++){
            int sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }

    }
}
