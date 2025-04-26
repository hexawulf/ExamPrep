package claudeAI2;
/*Exercise 16: Constructors
Create a class called BankAccount with attributes for accountNumber, owner, and balance. Implement three constructors:

A default constructor that sets default values
A constructor that takes accountNumber and owner parameters
A constructor that takes all three parameters

Target concept: Constructors and constructor overloading (Unit 7, Sections 7.1-7.2, pp. 104-111)
*/



public class Q16
{

	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount(12345652, "Smith");
		BankAccount b3 = new BankAccount(12332352, "Smith", 50000.00);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
