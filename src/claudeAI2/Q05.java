package claudeAI2;

/*
Exercise 5: Arithmetic Operations
Write a Java program that calculates the area and perimeter of a rectangle. 
The program should declare variables for width and height, perform the calculations, and output the results.
Target concept: Variables and arithmetic operators (Unit 4, Sections 4.2-4.3, pp. 57-60)
*/

public class Q05 {

    public static void main(String[] args) {
        rectangleCalc();
    } // end of psvm

    public static void rectangleCalc() {
        // Declare width and height
        double width = 5.0;
        double height = 10.0;

        // Perform calculations
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Output results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

} // end of class Q05
