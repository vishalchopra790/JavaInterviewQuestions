package naveen2;

public class IsNumber {
    public static void main(String[] args) {
        System.out.println(isCorrectPhoneNumber("98702505991"));
        System.out.println(isCorrectNumber("98702505991A"));
    }
    public static boolean isCorrectPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("[0-9]{10}");
    }
    public static boolean isCorrectNumber(String number) {
        return number.matches("^(-?\\d+\\.)?-?\\d+$");
    }
}
