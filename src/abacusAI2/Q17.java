package abacusAI2;
//17. Method Overriding
//Reference: Section 5.2, p. 83
//In the Dog class, override the makeSound() method from Animal to print a different message.
//Target concept: Method overriding


public class Q17
{

	public static void main(String[] args)
	{
		Animal doggie1 = new Dog();
		String doggieSound = doggie1.makeSound();
		System.out.println(doggie1.toString());
		System.out.println(doggieSound);// TODO Auto-generated method stub

	}

}
