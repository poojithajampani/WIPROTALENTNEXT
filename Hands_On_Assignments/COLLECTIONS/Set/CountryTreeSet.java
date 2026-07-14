import java.util.TreeSet;
import java.util.Iterator;

public class CountryTreeSet {

    // Instance variable
    TreeSet<String> H1 = new TreeSet<String>();

    // Method to add country names into TreeSet
    public TreeSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }

    // Method to search country in TreeSet
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

        CountryTreeSet obj = new CountryTreeSet();

        System.out.println(obj.saveCountryNames("India"));
        System.out.println(obj.saveCountryNames("USA"));
        System.out.println(obj.saveCountryNames("Japan"));
        System.out.println(obj.saveCountryNames("Australia"));

        System.out.println("\nTreeSet elements are stored in sorted order:");
        System.out.println(obj.H1);

        String result = obj.getCountry("India");

        if (result != null) {
            System.out.println("\nCountry found: " + result);
        } else {
            System.out.println("\nCountry not found");
        }

        result = obj.getCountry("China");

        if (result != null) {
            System.out.println("Country found: " + result);
        } else {
            System.out.println("Country not found");
        }
    }
}
