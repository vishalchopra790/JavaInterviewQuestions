package Dec28;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(6));
        printPrime(20);
    }

    private static Boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int j = 2; j < num / 2; j++) {
            if (num % j == 0)
                return false;
        }
        return true;
    }

    public static void printPrime(int n) {
        for (int i = 0; i <= n; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}

