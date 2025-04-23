package abacusAI2;
//20. Interfaces
//Reference: Section 9.2, p. 133
//Define an interface Movable with a method move(). Implement it in a class Car that prints "Car is moving".
//Target concept: Interfaces


public class Q20
{

	public static void main(String[] args)
	{
		Movable roadster = new Car();
		roadster.move();

	}

}
