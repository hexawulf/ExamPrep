package gemini25;
//Exercise 18: Method Overriding
//In the Animal class, add a method makeSound(). In the Cat class, override the makeSound() method to print "Meow". In the main method, call makeSound() on a Cat object.
//
//Course-book alignment: Unit 5, Section 5.2 (Page 87)    
//Target concept: Method overriding

public class Q18
{

	public static void main(String[] args)
	{
		Animal kittycat = new Cat();
		kittycat.makeSound();
		
	}

}
