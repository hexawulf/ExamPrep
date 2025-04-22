package chatGPT;

public class Book {
String author;
String title;

public Book(String author, String title) {
this.author = author;
this.title = title;
}
@Override
public String toString() {
    return "Book{title='" + title + "', author='" + author + "'}";
}

}