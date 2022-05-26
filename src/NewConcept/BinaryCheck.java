package NewConcept;

public class BinaryCheck {

    public static void isBin(int num){ boolean isBin = true;
        while(num!=0){
            int temp= num%10;
            if (temp>1) {
                isBin = false;
                break;
            }
            else{
                num=num/10;
            }


        }
        if(isBin)
            System.out.println("number is binary");
        else
            System.out.println("not binary");

    }


    public static void isBinary(int number){
        if(String.valueOf(number).matches("[0-1]+"))
            System.out.println("binary");
        else
            System.out.println("not binary");
    }
    public static void main(String[] args) {
        isBin(1);
        isBinary(0);
    }
}
