import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Map;

public class CountryCapitalHashtable {

    // Instance variable using Hashtable
    Hashtable<String, String> M1 = new Hashtable<String, String>();

    // 1. Method to save country and capital
    public Hashtable<String, String> saveCountryCapital(String CountryName, String capital) {
        M1.put(CountryName, capital);
        return M1;
    }

    // 2. Method to get capital using country name
    public String getCapital(String CountryName) {
        return M1.get(CountryName);
    }

    // 3. Method to get country using capital name
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    // 4. Method to create another Hashtable with capital as key and country as value
    public Hashtable<String, String> createCapitalCountryMap() {

        Hashtable<String, String> M2 = new Hashtable<String, String>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Method to create ArrayList with all country names
    public ArrayList<String> getCountryList() {

        ArrayList<String> countryList = new ArrayList<String>();

        for (String country : M1.keySet()) {
            countryList.add(country);
        }

        return countryList;
    }


    // Main method to test
    public static void main(String[] args) {

        CountryCapitalHashtable obj = new CountryCapitalHashtable();

        // Adding countries and capitals
        System.out.println(obj.saveCountryCapital("India", "Delhi"));
        System.out.println(obj.saveCountryCapital("Japan", "Tokyo"));
        System.out.println(obj.saveCountryCapital("USA", "Washington"));

        // Display Hashtable
        System.out.println("\nCountry-Capital Map:");
        System.out.println(obj.M1);

        // Get capital
        System.out.println("\nCapital of India: " + obj.getCapital("India"));

        // Get country
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));

        // Create M2
        System.out.println("\nCapital-Country Map:");
        System.out.println(obj.createCapitalCountryMap());

        // Country ArrayList
        System.out.println("\nCountry List:");
        System.out.println(obj.getCountryList());
    }
}
