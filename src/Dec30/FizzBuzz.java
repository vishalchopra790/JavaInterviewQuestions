package Dec30;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(100);
    }

    public static void fizzBuzz(int num) {

        for (int i = 0; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz " + i);
            else if (i % 5 == 0)
                System.out.println("Buzz " + i);
            else if (i % 3 == 0)
                System.out.println("Fizz" + i);
            else
                System.out.println(i);
        }

    }
}


// Time Complexity: O(1)
// Note:
// - Use % to check if number is divisible evenly by other number
// - check if number is divisible by 3 and 5 should go first



