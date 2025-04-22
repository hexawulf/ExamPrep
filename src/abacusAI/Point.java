package abacusAI;

public class Point
{
private int x;
private int y;
// Constructor to initialize the point
public Point(int x, int y)
{ 
	this.x = x;
	this.y = y;
}
// Copy constructor to create a new Point object as a copy of another Point object
public Point(Point other)
{
	this.x = other.x;
	this.y = other.y;
}
@Override
public String toString() {
	return "Point{x=" + x + ", y=" + y + "}";
}
}
