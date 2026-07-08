import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a color code: ");
        char code = Character.toUpperCase(sc.next().charAt(0));

        if (code == 'R') {
            System.out.println("Red");
        } else if (code == 'B') {
            System.out.println("Blue");
        } else if (code == 'G') {
            System.out.println("Green");
        } else if (code == 'O') {
            System.out.println("Orange");
        } else if (code == 'Y') {
            System.out.println("Yellow");
        } else if (code == 'W') {
            System.out.println("White");
        } else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}
