import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    public static List<String[]> read() {
        String csvFile = "us-500.csv";
        List<String[]> resoult = new ArrayList<>();
        try {

            Scanner fileReader = new Scanner(new File(csvFile));
            fileReader.nextLine();
            while (fileReader.hasNext()) {
                String[] firstName = fileReader.nextLine().split(",");
                resoult.add(firstName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return resoult;
    }
}