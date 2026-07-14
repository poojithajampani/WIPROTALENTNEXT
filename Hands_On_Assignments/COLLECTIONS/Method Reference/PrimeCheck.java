public class PrimeCheck {

    // Parameterized constructor
    public PrimeCheck(int n) {

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }


    public static void main(String[] args) {

        // Referring parameterized constructor using constructor reference
        PrimeCheckInterface pc = PrimeCheck::new;

        // Invoking constructor through functional interface
        pc.create(17);
        pc.create(20);
    }
}
