package HW4;

public class Book {
    private Integer bookId;
    private String name;
    private String author;

    public Book(Integer bookId, String name, String author) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
