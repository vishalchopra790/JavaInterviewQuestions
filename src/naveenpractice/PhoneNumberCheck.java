package naveenpractice;

public class PhoneNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPhoneNumber("9870250566"));
    }
    public static boolean isPhoneNumber(String num){
        return num.matches("[0-9]{10}");
    }
}
