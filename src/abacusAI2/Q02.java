package abacusAI2;

//2. Add Attributes to a Class
//Reference: Section 3.3, p. 42
//Add two attributes, String title and int pages, to the Book class.
//Target concept: Declaring attributes (fields)

public class Q02
{

	public static void main(String[] args)
	{
		Book book = new Book();
		book.toString();// TODO Auto-generated method stub
		book.setTitle("The Stand");
		System.out.println(book.getTitle());
		

	}

}
