package abacusAI2;
//3. Write a Method in a Class
//Reference: Section 3.4, p. 44
//Add a method printInfo() to the Book class that prints the title and number of pages.
//Target concept: Defining methods

public class Q03
{
public static void main(String[] args) {
	
	Book book = new Book();
	book.setTitle("The Stand");
	book.setPages(823);
	System.out.println(book.printInfo());

}
}
