import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Person> data = Reader.read();

        for (Person lines : data) {
            System.out.println(lines.getFirstName());
        }
    }
}
