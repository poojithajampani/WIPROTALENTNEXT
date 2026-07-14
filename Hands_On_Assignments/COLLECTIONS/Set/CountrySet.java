import java.util.HashSet;
import java.util.Iterator;

public class CountrySet {

    // Instance variable
    HashSet<String> H1 = new HashSet<String>();

    // Method to add country names into HashSet
    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    // Method to search country in HashSet
    public String getCountry(String CountryName) {

        Iterator<String> iterator = H1.iterator();

        while (iterator.hasNext()) {
            String country = iterator.next();

            if (country.equals(CountryName)) {
                return country;
            }
        }

        return null;
    }

    // Main method to test
    public static void main(String[] args) {

        CountrySet obj = new CountrySet();

        System.out.println(obj.saveCountryNames("India"));
        System.out.println(obj.saveCountryNames("USA"));
        System.out.println(obj.saveCountryNames("Japan"));
        System.out.println(obj.saveCountryNames("Australia"));

        String result = obj.getCountry("India");

        if (result != null) {
            System.out.println("Country found: " + result);
        } else {
            System.out.println("Country not found");
        }

        result = obj.getCountry("China");

        if (result != null) {
            System.out.println("Country found: " + result);
        } else {
            System.out.println("Country not found");
        }
    }
}
