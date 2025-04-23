package abacusAI2;
//18. Polymorphism
//Reference: Section 6.2, p. 96
//Write a class TestPolymorphism that creates an Animal reference to a Dog object and calls makeSound().
//Target concept: Polymorphism
public class Q18
{
	public static void main(String[] args) {
	Animal polly = new Dog();
	String dogSound = polly.makeSound();
	System.out.println("Polymorphism in action:");
	System.out.println(polly.toString());
	System.out.println(dogSound);// TODO Auto-generated method stub

}
}
