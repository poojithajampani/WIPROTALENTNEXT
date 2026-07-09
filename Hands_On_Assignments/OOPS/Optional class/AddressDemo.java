import java.util.Optional;

public class AddressDemo {
    public static void main(String[] args) {

        String address = null;
        // String address = "Hyderabad";

        String result = Optional.ofNullable(address)
                                .orElse("India");

        System.out.println(result);
    }
}
