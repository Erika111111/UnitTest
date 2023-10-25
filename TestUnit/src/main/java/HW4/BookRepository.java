package HW4;

public interface BookRepository {
   // метод добавления книги
    public void addBook(Book book);

    // метод удаления книги
    public void deleteBook(int bookId);
}
