package HW4;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook() {
        bookRepository.addBook(Book book);

    }

    public void deleteBook() {
        bookRepository.deleteBook(int bookId);

    }
}
