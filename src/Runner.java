
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Person> data = Reader.read();
        List<Person> filtered = Filter.cityFilter("New York", data);
        for (Person lines : data) {
            System.out.println(lines.getFirstName());
        }
        for (Person lines : filtered) {
            System.out.println(lines.getFirstName() + " - " + lines.getCity());
        }


    }
}
