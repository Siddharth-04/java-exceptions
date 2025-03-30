package bridgelabz.exceptions;

import java.util.*;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int [] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter index to retrieve value: ");
            int index = scanner.nextInt();

            System.out.println("Value at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer index.");
        } finally {
            scanner.close();
        }
    }
}
//Enter index to retrieve value: 7
//Invalid index!