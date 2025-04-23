package abacusAI2;
//5. Use Primitive Data Types
//Reference: Section 4.1, p. 56
//Declare variables of type int, double, and boolean in a class called DataTypesDemo. Assign them values and print them.
//Target concept: Primitive data types


public class Q05
{

	public static void main(String[] args)
	{
		DataTypesDemo typesDemo = new DataTypesDemo(123, 0.5, true);
		System.out.println(typesDemo.number);
		System.out.println(typesDemo.decimalNumber);
		System.out.println(typesDemo.isTrue);
	}

}
