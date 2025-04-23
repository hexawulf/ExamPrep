package abacusAI2;

public class Q07 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int num1 = 10;
        int num2 = 5;

        System.out.println("Sum: " + calc.add(num1, num2));
        System.out.println("Difference: " + calc.subtract(num1, num2));
        System.out.println("Product: " + calc.multiply(num1, num2));
        System.out.println("Quotient: " + calc.divide(num1, num2));
    }
}
