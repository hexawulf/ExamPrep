package claudeAI2;
/*Exercise 11: Inheritance
Create a superclass called Vehicle with attributes for manufacturer and modelYear. Then create a subclass called Car that extends Vehicle and adds an attribute for numberOfDoors. Include appropriate constructors for both classes.
Target concept: Inheritance with extends keyword (Unit 5, Section 5.2, pp. 83-86)*/


public class Q11
{

	public static void main(String[] args)
	{
		
			Car c1 = new Car("Toyota", 1974, 4);
			System.out.println(c1);

			Car c2 = new Car();
			System.out.println(c2);

			}

	}


