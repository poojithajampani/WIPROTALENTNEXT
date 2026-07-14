public class DigitCountClass {

    // Static method to count number of digits
    public static int digitCount(int n) {

        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }


    public static void main(String[] args) {

        // Referring static method using method reference
        DigitCountInterface dc = DigitCountClass::digitCount;

        // Invoking functional interface method
        int result = dc.count(12345);

        System.out.println("Number of digits: " + result);
    }
}
