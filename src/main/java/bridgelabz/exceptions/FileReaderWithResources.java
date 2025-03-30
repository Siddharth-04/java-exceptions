package bridgelabz.exceptions;

import java.io.*;

public class FileReaderWithResources {
    public static void main(String[] args) {
        String fileName = "D:/8th sem/bridgelabz.workspace/java-exceptions/src/main/java/bridgelabz/exceptions/data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            if (line != null) {
                System.out.println("First line: " + line);
            } else {
                System.out.println("File is empty.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }
}
//First line: Read the contents of this file please !