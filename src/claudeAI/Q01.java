package claudeAI;
//Exercise 1: Creating a Basic Class
//Target Concept: Class declaration and structure
//Create a class named Rectangle with two attributes: length and width (both of type double). Include a method called calculateArea() that returns the area of the rectangle.










public class Q01 {
    public class Rectangle {
        double length;
        double width;

        // Constructor to initialize length and width
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // Method to calculate area using instance variables
        public double calculateArea() {
            double area = this.length * this.width;
            System.out.println("Area: " + area);
            return area;
        }
    }
}
