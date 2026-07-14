import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        // Creating HashMap with generics (String, Integer)
        HashMap<String, Integer> contacts = new HashMap<String, Integer>();

        // Adding contacts
        contacts.put("Pooja", 987654321);
        contacts.put("Rahul", 876543210);
        contacts.put("Anitha", 912345678);
        contacts.put("Kiran", 998877665);

        System.out.println("Contact List:");
        System.out.println(contacts);

        // a) Check if a particular key exists
        String name = "Pooja";

        if (contacts.containsKey(name)) {
            System.out.println("\nContact name '" + name + "' exists");
        } else {
            System.out.println("\nContact name does not exist");
        }

        // b) Check if a particular value exists
        Integer phoneNumber = 876543210;

        if (contacts.containsValue(phoneNumber)) {
            System.out.println("Phone number '" + phoneNumber + "' exists");
        } else {
            System.out.println("Phone number does not exist");
        }

        // c) Using Iterator to loop through the map
        System.out.println("\nContact List using Iterator:");

        Iterator<Map.Entry<String, Integer>> iterator = contacts.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println("Name: " + entry.getKey() +
                               "  Phone Number: " + entry.getValue());
        }
    }
}
