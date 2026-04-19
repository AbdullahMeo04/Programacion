import java.io.*;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        int count = readFileAndCount("arxiu.txt");

        if (count != -1) {
            writeFile("sortida.txt", count);
        }
    }

    public static int readFileAndCount(String fileName) {
        int words = 0;
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                scanner.next();
                words++;
            }
            return words;
        } catch (FileNotFoundException e) {
            System.out.println("Error: arxiu.txt not found.");
            return -1;
        }
    }

    public static void writeFile(String fileName, int count) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, false))) {
            writer.println("The file has " + count + " Words.");
            System.out.println("Process finished successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
        }
    }
}
