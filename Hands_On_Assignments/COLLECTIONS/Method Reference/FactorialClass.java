public class FactorialClass {

    // Instance method to calculate factorial
    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }


    public static void main(String[] args) {

        FactorialClass obj = new FactorialClass();

        // Referring instance method using method reference
        FactorialInterface fi = obj::factorial;

        // Invoking functional interface method
        int result = fi.calculate(5);

        System.out.println("Factorial of 5 is: " + result);
    }
}
