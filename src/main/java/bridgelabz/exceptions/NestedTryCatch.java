package bridgelabz.exceptions;

import java.util.*;

public class NestedTryCatch{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = scanner.nextInt();

            try {
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                int result = arr[index] / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            scanner.close();
        }
    }
}
//Enter array index: 4
//Enter divisor: 2
//Result: 25