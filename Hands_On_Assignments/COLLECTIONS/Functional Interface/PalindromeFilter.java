import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeFilter {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("hello");
        words.add("radar");
        words.add("world");
        words.add("noon");
        words.add("apple");
        words.add("racecar");
        words.add("wipro");

        // Predicate to check palindrome
        Predicate<String> isPalindrome = word -> {
            String rev = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }
    }
}
