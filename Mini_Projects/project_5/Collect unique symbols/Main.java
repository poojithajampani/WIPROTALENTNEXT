import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> symbols = new HashSet<>();
        TreeMap<String, Card> cards = new TreeMap<>();

        int count = 0;

        while (symbols.size() < 4) {

            System.out.println("Enter a card :");

            String symbol = sc.next();
            int number = sc.nextInt();

            count++;

            if (!symbols.contains(symbol)) {
                symbols.add(symbol);
                cards.put(symbol, new Card(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        for (Card c : cards.values()) {
            System.out.println(c.getSymbol() + " " + c.getNumber());
        }

        sc.close();
    }
}
