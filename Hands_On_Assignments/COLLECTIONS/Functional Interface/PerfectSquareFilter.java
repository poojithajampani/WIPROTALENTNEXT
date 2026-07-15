import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(15);
        numbers.add(16);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(36);
        numbers.add(50);

        // Predicate to check perfect square
        Predicate<Integer> isPerfectSquare = num -> {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        };

        System.out.println("Perfect Square Numbers:");

        for (int num : numbers) {
            if (isPerfectSquare.test(num)) {
                System.out.println(num);
            }
        }
    }
}
