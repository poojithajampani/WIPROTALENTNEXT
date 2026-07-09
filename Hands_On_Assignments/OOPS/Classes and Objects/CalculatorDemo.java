 class PowerCalculator {

    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        int result1 = PowerCalculator.powerInt(2, 5);
        System.out.println("2^5 = " + result1);

        double result2 = PowerCalculator.powerDouble(2.5, 3);
        System.out.println("2.5^3 = " + result2);
    }
}
