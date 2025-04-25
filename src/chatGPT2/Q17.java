package chatGPT2;
/*17. Overriding Methods
Problem: Override the method describe() in a subclass Car that inherits from Vehicle.
Course-book alignment: Unit 5.2 (Inheritance in Java), Unit 6.2 (Polymorphism)
Target concept: Method overriding*/


public class Q17
{

	public static void main(String[] args)
	{
		    Vehicle c = new Car("Toyota", "Corolla", 1970, 540.10);
	        String cardetails = c.describe();
	        System.out.println(cardetails);
    } //end of psvm
	
} //end of Q17 class


