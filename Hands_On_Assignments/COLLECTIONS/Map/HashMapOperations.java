import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapOperations {

    public static void main(String[] args) {

        // Creating HashMap to store String objects
        HashMap<String, String> map = new HashMap<String, String>();

        // Adding key-value pairs
        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("Australia", "Canberra");

        System.out.println("HashMap Elements:");
        System.out.println(map);

        // a) Check if a particular key exists
        String key = "India";

        if (map.containsKey(key)) {
            System.out.println("\nKey '" + key + "' exists in HashMap");
        } else {
            System.out.println("\nKey '" + key + "' does not exist");
        }

        // b) Check if a particular value exists
        String value = "Tokyo";

        if (map.containsValue(value)) {
            System.out.println("Value '" + value + "' exists in HashMap");
        } else {
            System.out.println("Value '" + value + "' does not exist");
        }

        // c) Using Iterator to loop through the map
        System.out.println("\nIterating HashMap elements:");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            System.out.println("Key: " + entry.getKey() +
                               "  Value: " + entry.getValue());
        }
    }
}
