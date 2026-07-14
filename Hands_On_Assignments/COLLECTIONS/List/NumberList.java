import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);        // Integer
        list.add(20.5f);     // Float
        list.add(35.75);     // Double
        list.add(100L);      // Long
        list.add((short)15); // Short
        list.add((byte)5);   // Byte

        System.out.println("Numbers in the ArrayList:");

        for (Number n : list) {
            System.out.println(n);
        }
    }
}
