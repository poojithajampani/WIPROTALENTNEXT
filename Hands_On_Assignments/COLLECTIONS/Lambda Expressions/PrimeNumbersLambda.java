import java.util.ArrayList;
import java.util.Random;

public class PrimeNumbersLambda {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Generating 25 random numbers
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            al.add(random.nextInt(100) + 1); // numbers between 1 and 100
        }

        System.out.println("ArrayList elements:");
        System.out.println(al);

        System.out.println("\nPrime numbers present in ArrayList:");

        // Lambda expression to print prime numbers
        al.forEach(number -> {
            if (isPrime(number)) {
                System.out.println(number);
            }
        });
    }

    // Method to check prime number
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
