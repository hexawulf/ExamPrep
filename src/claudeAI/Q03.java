package claudeAI;
//Exercise 3: Constructors
//Target Concept: Constructor implementation and overloading
//Create a class Book with attributes: title (String), author (String), and pages (int). Implement two constructors:
//
//A default constructor that sets default values
//A parameterized constructor that accepts values for all attributes
public class Q03
{
	public class Book {
		String title; 
		String author;
		int pages;

		public Book() {
		
		}

		public Book(String title, String author, int pages) {
		this.title=title;
		this.author=author;
		this.pages=pages;
		}
		}
}
