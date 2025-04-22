package claudeAI;
//Exercise 15: Exception Handling
//Target Concept: Try-catch blocks
//Write a method divide that takes two integer parameters and returns their division. Use a try-catch block to handle the possibility of division by zero and return 0 in that case.

public class Q15 {
    public static void main(String[] args) {
        // Test Case 1: normal division
        int result1 = ExceptionHandler.divide(10, 2);
        System.out.println("10 / 2 = " + result1);

        // Test Case 2: division by zero
        int result2 = ExceptionHandler.divide(10, 0);
        System.out.println("10 / 0 = " + result2);
    }
}
