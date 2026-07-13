import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num < 1 || num > 255) {
            System.out.println("Please enter a number between 1 and 255.");
        } else {
            String binary = Integer.toBinaryString(num);
            binary = String.format("%8s", binary).replace(' ', '0');
            System.out.println(binary);
        }

        sc.close();
    }
}
