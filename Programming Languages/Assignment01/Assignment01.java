import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.File;

public class Assignment01 {
    static void modifyFile(String filePath, String oldString, String newString) {
        File fileToBeModified = new File("Assignment01java.txt");
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("Assignment01java.txt"));
            String line = reader.readLine();
            while (line != null) {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newContent = oldContent.replaceAll(oldString, newString);
            writer = new FileWriter("Assignment01java.txt");
            writer.write(newContent);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
                writer.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        modifyFile("Change to file", "aa", "0");
        modifyFile("Change to file", "ac", "1");
        modifyFile("Change to file", "ag", "2");
        modifyFile("Change to file", "at", "3");
        modifyFile("Change to file", "ca", "4");
        modifyFile("Change to file", "cc", "5");
        modifyFile("Change to file", "cg", "6");
        modifyFile("Change to file", "ct", "7");
        modifyFile("Change to file", "ga", "8");
        modifyFile("Change to file", "gc", "9");
        modifyFile("Change to file", "gg", "A");
        modifyFile("Change to file", "gt", "B");
        modifyFile("Change to file", "ta", "C");
        modifyFile("Change to file", "tc", "D");
        modifyFile("Change to file", "tg", "E");
        modifyFile("Change to file", "tt", "F");
        System.out.println("Done");
    }
}