
import java.util.ArrayList;
import java.util.List;



public class Filter {


    public static List<Person> cityFilter(String city, List<Person> list) {
        List<Person>result = new ArrayList<>();
        for (Person person : list) {
            if (person.getCity().equals(city)){
                result.add(person);
            }
        } return result;

    }

}
