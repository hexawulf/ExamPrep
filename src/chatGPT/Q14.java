package chatGPT;

public class Q14
{

	public static void main(String[] args)
	{
//14. Class with Constructor
//Topic: Constructors
//Task: Create a Book class with a constructor accepting title and author. Print both.
//Target Concept: Parameterized constructor.
		Book book = new Book("The Stand", "Stephen King");
		System.out.println("Title: " + book.title);
		System.out.println("Author: " + book.author);
		System.out.println("toString() output: " + book.toString());

		
		
	}

}
