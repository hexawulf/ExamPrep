package chatGPT2;

public class Circle extends Shape {
    private int dia; // diameter

    // Constructor to initialize diameter
    public Circle(int dia) {
        this.dia = dia;
    }

    @Override
    public double getArea() {
        double radius = dia / 2.0;
        return Math.PI * radius * radius;
    }
}