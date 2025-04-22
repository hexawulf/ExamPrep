package claudeAI;
//Exercise 4: Main Method
//Target Concept: Main method as program entry point
//Write a Java program with a main method that creates two Circle objects with different radii, calculates their areas, and prints the results to the console.


public class Q04 {
    public static void main(String[] args) {
        // Create two Circle objects with different radii
        Circle circle1 = new Circle(5.0); // Radius = 5.0
        Circle circle2 = new Circle(7.5); // Radius = 7.5

        // Calculate and print the areas of the circles
        System.out.println("Area of Circle 1: " + circle1.calculateArea());
        System.out.println("Area of Circle 2: " + circle2.calculateArea());
    }
}
