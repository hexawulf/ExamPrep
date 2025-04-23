package abacusAI2;

//1. Create a Simple Java Class
//Reference: Section 3.2, p. 41
//Write a Java class named Book with no attributes or methods.
//Target concept: Declaring a class

public class Book
{
	
	//Attributes
	private String title;
	private int pages;
	
	
	//setters and getters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPages() {
		return pages;
				
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	//printInfo method

public String printInfo() {

return "Title: " + title + ", Pages:  " + pages;

}
	
//Constructors
public Book() {
this.title=null;
this.pages=0;
}

public Book(String title, int pages) {
this.title=title;
this.pages=pages;
}


	
@Override

public String toString() {
    return "Book{title='" + title + "', pages=" + pages + "}";
}

}
