import java.util.ArrayList;

public class OddLengthStringsLambda {

    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> al = new ArrayList<String>();

        // Adding 10 different words
        al.add("Apple");
        al.add("Banana");
        al.add("Cat");
        al.add("Mango");
        al.add("Orange");
        al.add("Dog");
        al.add("Elephant");
        al.add("Book");
        al.add("Pen");
        al.add("Computer");

        System.out.println("ArrayList elements:");
        System.out.println(al);

        System.out.println("\nStrings with odd length:");

        // Lambda expression to print strings with odd length
        al.forEach(word -> {
            if (word.length() % 2 != 0) {
                System.out.println(word);
            }
        });
    }
}