package chatGPT2;
/*18. Abstract Class for Shape
Problem: Define an abstract class Shape with getArea() method. Implement it in Circle and Square.
Course-book alignment: Unit 6.1 (Abstract Classes)
Target concept: Abstract methods and classes*/
public class Q18
{
	public static void main(String[] args) {

		Shape sq = new Square(5);
		Shape ci = new Circle(5);
		double sqArea = sq.getArea();
		double ciArea = ci.getArea();

		System.out.println(sqArea);
		System.out.println(ciArea);

		}
}
