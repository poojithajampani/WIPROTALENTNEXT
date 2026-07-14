import java.util.Scanner;

class NegativeValuesException extends Exception {
    public NegativeValuesException(String message) {
        super(message);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter the name of Student " + i + ":");
                String name = sc.nextLine();

                int total = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    String input = sc.nextLine();

                    int mark = Integer.parseInt(input);

                    if (mark < 0) {
                        throw new NegativeValuesException(
                                "Marks cannot be negative.");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException(
                                "Marks should be between 0 and 100.");
                    }

                    total += mark;
                }

                double average = total / 3.0;

                System.out.println("Average marks of " + name + " = " + average);
                System.out.println();
            }
        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter only integer values.");
        }

        catch (NegativeValuesException e) {
            System.out.println(e.getMessage());
        }

        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        finally {
            sc.close();
        }
    }
}
