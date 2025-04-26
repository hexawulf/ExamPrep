package claudeAI2;
/*Exercise 13: Abstract Class
Create an abstract class called Animal with an abstract method makeSound(). Then create two concrete subclasses Dog and Cat that implement the abstract method appropriately.
Target concept: Abstract classes and methods (Unit 6, Section 6.1, pp. 92-96)*/


public class Q13
{

	public static void main(String[] args)
	{
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		System.out.println(a1.makeSound());
		System.out.println(a2.makeSound());

	}

}
