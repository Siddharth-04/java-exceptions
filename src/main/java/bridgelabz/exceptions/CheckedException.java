package bridgelabz.exceptions;

import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        String fileName = "D:/8th sem/bridgelabz.workspace/java-exceptions/src/main/java/bridgelabz/exceptions/data.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file");
        }
    }
}
//Read the contents of this file please !