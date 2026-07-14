import java.util.TreeSet;
import java.util.Iterator;
import java.util.Collections;

public class TreeSetOperations {

    public static void main(String[] args) {

        // Creating TreeSet to store String objects
        TreeSet<String> countries = new TreeSet<String>();

        // Adding elements
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("Australia");
        countries.add("Canada");

        System.out.println("Original TreeSet:");
        System.out.println(countries);

        // a) Reverse the elements of the Collection
        TreeSet<String> reverseSet = (TreeSet<String>) countries.descendingSet();

        System.out.println("\nReversed TreeSet:");
        System.out.println(reverseSet);

        // b) Iterate elements using Iterator
        System.out.println("\nIterating TreeSet elements:");

        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();
            System.out.println(country);
        }

        // c) Check if a particular element exists
        String searchElement = "India";

        if (countries.contains(searchElement)) {
            System.out.println("\n" + searchElement + " exists in TreeSet");
        } else {
            System.out.println("\n" + searchElement + " does not exist in TreeSet");
        }
    }
}
