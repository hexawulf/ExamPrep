package abacusAI2;
//13. Access Modifiers
//Reference: Section 4.5, p. 73
//Change the pages attribute in the Book class to private and access it using a public getter.
//Target concept: Access modifiers (private/public)
public class Q13
{

	public static void main(String[] args)
	{
		Book book1 = new Book();
		book1.setPages(821);
		book1.setTitle("The Stand");
		int pages = book1.getPages();
		System.out.println(book1);
		System.out.println(pages);

	}

}
