package semenar5Test3;

import seminar5Task3.Book;
import seminar5Task3.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookServiceIntegrationTest {
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        bookService = new BookService();
    }

    @Test
    public void testAddBookAndGetAllBooks() {
// Задание:
// 1. Создайте 3 книги и добавьте их в bookService.
        Book book1 = new Book("Title1", "Avtor1");
        Book book2 = new Book("Title2", "Avtor2");
        Book book3 = new Book("Title3", "Avtor3");

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);


// 2. Получите список всех книг из bookService.
        List <Book> list = bookService.getAllBooks();

// 3. Проверьте, что список не является null.
    assertNotNull(list);
// 4. Проверьте, что список содержит 3 книги.
    assertEquals(3, list.size());
// 5. Выведите информацию о каждой книге (используйте метод toString).
       for (Book book: list){
           System.out.println(book);
       }


        System.out.println(book1.toString());


// Подсказка: Используйте методы addBook и getAllBooks из bookService.
// Проверьте, что результаты соответствуют ожиданиям.

        assertEquals("title",list.get(0).getTitle());
        assertEquals("avtor",list.get(0).getAuthor());
        assertEquals("title",list.get(1).getTitle());
        assertEquals("avtor",list.get(1).getAuthor());
        assertEquals("title",list.get(2).getTitle());
        assertEquals("avtor",list.get(2).getAuthor());
// проведите Все возможные интеграционное тестирование.

// Ваш код здесь
    }
}
