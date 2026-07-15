import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Wipro");
        words.add("Talent");
        words.add("Next");
        words.add("Collection");
        words.add("ArrayList");
        words.add("Consumer");
        words.add("Lambda");
        words.add("Program");
        words.add("Practice");

        // Consumer to reverse each word
        Consumer<String> reverseWord = word -> {
            int index = words.indexOf(word);
            String reversed = new StringBuilder(word).reverse().toString();
            words.set(index, reversed);
        };

        words.forEach(reverseWord);

        System.out.println("Updated ArrayList:");
        System.out.println(words);
    }
}
