import java.util.Properties;
import java.util.Iterator;
import java.util.Set;

public class StateCapitalProperties {

    public static void main(String[] args) {

        // Creating Properties object
        Properties states = new Properties();

        // Adding states and capitals
        states.setProperty("Andhra Pradesh", "Amaravati");
        states.setProperty("Telangana", "Hyderabad");
        states.setProperty("Tamil Nadu", "Chennai");
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Maharashtra", "Mumbai");

        // Getting all keys from Properties
        Set<Object> keys = states.keySet();

        // Creating Iterator
        Iterator<Object> iterator = keys.iterator();

        // Displaying elements
        System.out.println("States and their Capitals:");

        while (iterator.hasNext()) {

            Object state = iterator.next();

            System.out.println(state + " : " + states.getProperty((String) state));
        }
    }
}
