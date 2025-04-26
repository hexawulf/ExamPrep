package claudeAI2;
/*Exercise 1: Basic Class Structure
Create a class named Book with three attributes: title (String), author (String), and yearPublished (int). Include appropriate visibility modifiers for the attributes. The class should not contain any methods yet.
Target concept: Basic class structure with attributes (Unit 3, Section 3.2-3.3, pp. 41-44)*/


public class Q01 {
    public static void main(String[] args) {
        Book b = new Book("1984", "George Orwell", 1949);
        System.out.println(b);
    }
}