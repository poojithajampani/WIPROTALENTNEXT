import java.util.ArrayList;

public class NegativeEvenNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(-2);
        list.add(-5);
        list.add(8);
        list.add(-12);
        list.add(15);
        list.add(-7);
        list.add(-20);

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : list) {
            if (num < 0 && num % 2 == 0) {
                result.add(num);
            }
        }

        System.out.println("Negative Even Numbers:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
