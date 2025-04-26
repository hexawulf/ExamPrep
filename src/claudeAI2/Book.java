package claudeAI2;

public class Book {

private String title;
private String author;
private int yearPublished;



public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + yearPublished + ")";
    }
}
