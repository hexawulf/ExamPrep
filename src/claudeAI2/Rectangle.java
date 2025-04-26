package claudeAI2;

public class Rectangle extends Shape {
private int width;
private int height;


public Rectangle(int width, int height) {
this.width = width;
this.height = height;
}

public Rectangle() {
this(0, 0);
}

@Override // Override the calculateArea() method to return the area of the rectangle for Q12

public double calculateArea() {
    return width * height; // Use the instance variables
}

@Override
public String toString() {
    return "Rectangle{ width=" + width + ", height=" + height + " }";
}

    

}
