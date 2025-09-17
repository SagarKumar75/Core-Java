
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Example.txt");
            writer.write("Hello, Java file handling!");
            writer.close();

            BufferedReader reader = new BufferedReader((new FileReader("Example.txt")));
            String line = reader.readLine();
            System.out.println("File Content: " + line);
            reader.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

}
