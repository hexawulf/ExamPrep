package claudeAI2;
/*Exercise 12: Method Overriding
Create a superclass called Shape with a method called calculateArea() that returns 0.0. Create two subclasses: Circle with a radius attribute and Rectangle with width and height attributes. Override the calculateArea() method in both subclasses to return the correct area value.
Target concept: Method overriding in subclasses (Unit 5, Section 5.2, pp. 87-90)*/


public class Q12 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);          // radius = 5
        Shape s2 = new Rectangle(5, 10);   // width = 5, height = 10

        System.out.println("Area of Circle: " + s1.calculateArea());
        System.out.println("Area of Rectangle: " + s2.calculateArea());
    }
}
