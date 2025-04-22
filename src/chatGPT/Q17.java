package chatGPT;

public class Q17
{

	public static void main(String[] args)
	{
//	17. Overriding Methods
//Topic: Method Overriding
//Task: Override a describe() method in Car class to include car-specific information.
//Target Concept: Polymorphism.
		Vehicle car1 = new Car();	
		Vehicle car2 = new Vehicle();
		System.out.println(car1);
		System.out.println(car2);
		car1.start(); // Should call Car's version
		car2.start(); // Should call Vehicle's version
		car1.describe();  // Should call Car's version
		car2.describe();  // Should call Vehicle's version


	}

}
