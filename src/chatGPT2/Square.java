package chatGPT2;

public class Square extends Shape {
    private int side;

    // Constructor to initialize side length
    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
