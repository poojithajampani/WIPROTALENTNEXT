import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Pooja");
        names.add("Rahul");
        names.add("Anjali");
        names.add("Kiran");

        StringJoiner sj = new StringJoiner(", ", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println(sj);
    }
}
