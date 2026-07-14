import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class CountryCapital {

    // Instance variable
    HashMap<String, String> M1 = new HashMap<String, String>();

    // 1. Method to add country and capital into Map
    public HashMap<String, String> saveCountryCapital(String CountryName, String capital) {
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

    // 4. Method to create another Map M2 with Capital as key and Country as value
    public HashMap<String, String> createCapitalCountryMap() {

        HashMap<String, String> M2 = new HashMap<String, String>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // 5. Method to create ArrayList with country names
    public ArrayList<String> getCountryList() {

        ArrayList<String> countryList = new ArrayList<String>();

        for (String country : M1.keySet()) {
            countryList.add(country);
        }

        return countryList;
    }


    // Main method to test
    public static void main(String[] args) {

        CountryCapital obj = new CountryCapital();

        // Adding countries and capitals
        System.out.println(obj.saveCountryCapital("India", "Delhi"));
        System.out.println(obj.saveCountryCapital("Japan", "Tokyo"));
        System.out.println(obj.saveCountryCapital("USA", "Washington"));

        // Get capital for country
        System.out.println("\nCapital of India: " + obj.getCapital("India"));

        // Get country for capital
        System.out.println("Country with capital Tokyo: " + obj.getCountry("Tokyo"));

        // Create M2
        System.out.println("\nM2 (Capital as Key, Country as Value):");
        System.out.println(obj.createCapitalCountryMap());

        // Create ArrayList of countries
        System.out.println("\nCountry List:");
        System.out.println(obj.getCountryList());
    }
}
