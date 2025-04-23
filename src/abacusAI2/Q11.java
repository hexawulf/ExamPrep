package abacusAI2;
//11. Create and Use Constructors
//Reference: Section 3.2, p. 41
//Add a constructor to the Book class that sets the title and pages.
//Target concept: Constructors


public class Q11
{

	public static void main(String[] args)
	{
		Book book1 = new Book();
		Book book2 = new Book("The Stand", 823);
		System.out.println(book1.toString());
		System.out.println(book2.toString());

	}

}
