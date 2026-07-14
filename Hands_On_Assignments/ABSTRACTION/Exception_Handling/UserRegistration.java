import java.util.Scanner;

class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {

    public void registerUser(String username, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.trim().equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        }

        System.out.println("Username : " + username);
        System.out.println("Country  : " + userCountry);
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Country: ");
        String country = sc.nextLine();

        UserRegistration user = new UserRegistration();

        try {
            user.registerUser(username, country);
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}