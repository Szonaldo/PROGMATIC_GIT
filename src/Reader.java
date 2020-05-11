import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static List<Person> read() {
        String csvFile = "us-500.csv";
        List<Person> result = new ArrayList<>();
        try {

            Scanner fileReader = new Scanner(new File(csvFile));
            fileReader.nextLine();
            while (fileReader.hasNext()) {
                String[] line = fileReader.nextLine().split(",");
                result.add(new Person(line[0],line[1],line[4],line[10]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}