package chatGPT;

import java.util.Scanner;

public class Q20 {

    public static void main(String[] args) {
        // 20. Exception Handling
        // Topic: try-catch block
        // Task: Prompt user to divide two numbers. Catch division by zero.
        // Input: 10 / 0
        // Output: Cannot divide by zero!
        // Target Concept: Runtime exception handling.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int int1 = scanner.nextInt();

        System.out.println("Enter a second integer: ");
        int int2 = scanner.nextInt();

        try {
            int result = int1 / int2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        scanner.close();
    }
}
