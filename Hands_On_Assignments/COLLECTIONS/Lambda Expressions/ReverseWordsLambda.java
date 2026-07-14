import java.util.ArrayList;
import java.util.Collections;

public class ReverseWordsLambda {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> al = new ArrayList<String>();

        // Adding 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("Mango");
        al.add("Orange");
        al.add("Grapes");
        al.add("Papaya");
        al.add("Guava");
        al.add("Pineapple");
        al.add("Watermelon");

        System.out.println("Original ArrayList:");
        System.out.println(al);

        // Reversing the ArrayList
        Collections.reverse(al);

        System.out.println("\nStrings in reverse order:");

        // Lambda expression to print elements
        al.forEach(word -> System.out.println(word));
    }
}
