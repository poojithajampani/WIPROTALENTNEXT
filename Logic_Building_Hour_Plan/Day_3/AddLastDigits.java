import java.util.Scanner;

public class AddLastDigits {

    public static int addLastDigits(int input1, int input2) {
        int lastDigit1 = Math.abs(input1 % 10);
        int lastDigit2 = Math.abs(input2 % 10);

        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input1 = sc.nextInt();
        int input2 = sc.nextInt();

        System.out.println(addLastDigits(input1, input2));

        sc.close();
    }
}