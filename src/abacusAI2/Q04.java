package abacusAI2;
//4. The main() Method
//Reference: Section 3.5, p. 51
//Add a main method to the Book class that creates a Book object and calls printInfo().
//Sample Output:
//
//Title: Java Basics, Pages: 200
//Target concept: main method as program entry point

public class Q04
{

	public static void main(String[] args)
	{
		Book book = new Book();
		book.setTitle("The Stand");
		book.setPages(823);
		System.out.println(book.printInfo());

	}

}
