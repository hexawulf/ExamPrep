package claudeAI;

public class ExceptionHandler {

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero detected. Returning 0.");
            return 0;
        }
    }
}
