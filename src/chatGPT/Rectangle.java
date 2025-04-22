package chatGPT;

public class Rectangle
{
	//instance variables
int length;
int width;

//constructor
public Rectangle(int length, int width)
{
this.length = length;
this.width = width;

//getters and setters
}
public int getLength()
{ return length; }
public int getWidth()
{ return width; }

public void setLength(int length)
{ this.length = length; }
public void setWidth(int width)
{ this.width = width; }


//methods
public int getArea()
{ 
	int area = length * width;
	return area; }
//method to calculate perimeter
public int getPerimeter()
{ 
	int perimeter = 2 * (length + width);
	return perimeter; }

@Override
public String toString() {
    return "Rectangle{length=" + length +
           ", width=" + width +
           ", area=" + getArea() +
           ", perimeter=" + getPerimeter() + "}";
}

}