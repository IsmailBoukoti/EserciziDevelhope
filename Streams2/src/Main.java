import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String date = String.valueOf(LocalDateTime.now());

        String fileName = "src\\file.txt";
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("The file exists : you are gonna overwrite it ");
        } else {
            System.out.println("Creating new file");
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(date);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}