package claudeAI;

public class Square extends Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
