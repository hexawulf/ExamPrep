package abacusAI2;
//6. Variable Declaration and Assignment
//Reference: Section 4.2, p. 57
//Write a class VariableDemo that declares a variable int count, assigns it the value 10, and prints it.
//Target concept: Variable declaration and assignment

public class Q06
{

	public static void main(String[] args)
	{
		VariableDemo numberDemo = new VariableDemo();
		numberDemo.setCount(10);
		System.out.println(numberDemo.getCount());
		System.out.println(numberDemo.toString());

	}

}
