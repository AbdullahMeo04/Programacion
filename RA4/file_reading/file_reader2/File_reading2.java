package RA4.file_reading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InvertFile2 {
    public static void main(String[] args) {

        File inputFile = new File("arxiu.txt");

        try {

            if (!inputFile.exists()) {
                System.out.println("File arxiu.txt not found!");
                return;
            }

            Scanner scn = new Scanner(inputFile);
            FileWriter writer = new FileWriter("arxiu_invertit.txt");

            while (scn.hasNextLine()) {

                String line = scn.nextLine();
                String reversed = new StringBuilder(line).reverse().toString();

                writer.write(reversed + "\n");
            }

            scn.close();
            writer.close();

            System.out.println("File successfully processed!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}