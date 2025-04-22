package claudeAI;
//Exercise 8: Method Overloading
//Target Concept: Method overloading
//Create a class Calculator with three overloaded methods named add:
//
//Takes two integers and returns their sum
//Takes three integers and returns their sum
//Takes two doubles and returns their sum

public class Q08 {
public static void main(String[] args) {
    // Create an instance of the Calculator class
    Calculator calculator = new Calculator();

    // Test the overloaded methods
    System.out.println("Sum of two integers: " + calculator.add(5, 10));
    System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
    System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
}
}