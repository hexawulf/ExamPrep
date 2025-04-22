package abacusAI;

public class Q17 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result; // result will also be an integer

        try {
            result = num1 / num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    } // end of psvm
}