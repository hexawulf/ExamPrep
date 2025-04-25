package chatGPT2;
/*14. Getter and Setter
Problem: Implement private attributes in a class and use getter/setter methods to read/update them.
Course-book alignment: Unit 3.4, Unit 7.1–7.2; Session 5 Transfer Task 4
Target concept: Encapsulation with getter and setter*/

public class Q14
{
public static void main(String[] args)
{
	Customer cust1 = new Customer("0xWulf", 54);
	String cust1Name = cust1.getName();
	int cust1Age = cust1.getAge();

	System.out.println(cust1Name + " , " + cust1Age);
	System.out.println(cust1.toString());
}
}