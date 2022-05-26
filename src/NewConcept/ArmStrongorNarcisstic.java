package NewConcept;

public class ArmStrongorNarcisstic {

    static boolean isArmstrong(int num) {
        if (num < 0)
            return false;
        if (num > 0 && num <= 9)
            return true;

        int power = power(num);
        int sum = 0;
        int copy = num;
        while (copy != 0) {
            int lastdigit = copy % 10;
            int factor = 1;
            for (int i = 0; i < power; i++) {
                factor = factor * lastdigit;
            }
            sum = sum + factor;
            copy = copy / 10;

        }

        if(sum==num)
            return true;

        return false;
    }

    static int power(int number) {
        int num = 0;
        while (number != 0) {
            num++;
            number = number / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(9474));
    }
}
