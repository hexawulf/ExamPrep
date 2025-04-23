package abacusAI2;
//16. Inheritance
//Reference: Section 5.2, p. 83
//Create a class Animal with a method makeSound(). Create a subclass Dog that overrides makeSound() to print "Woof!".
//Target concept: Inheritance


public class Q16
{

	public static void main(String[] args)
	{
		Animal wulfie = new Dog();
		String wulfieSound = wulfie.makeSound();
		System.out.println(wulfie.toString());
		System.out.println(wulfieSound);
		

	}

}
