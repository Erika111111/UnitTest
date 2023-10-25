package hw4Test;
import static org.mockito.Mockito.*;


import HW4.Book;
import HW4.BookRepository;
import HW4.BookService;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class BookServiceMockTest {


    @Before
   public void testMockBookService(){
        BookRepository bookRepository = mock(BookRepository.class);

        BookService bookService = new BookService(bookRepository);
    }

    @Test
    public void testFindAllBook() {
        // создание объекта book1 типа Book с переданными параметрами.
        Book book1 = new Book(1, "Book1", "Author1");
        // создание объекта book2 типа Book с переданными параметрами.
        Book book2 = new Book(2, "Book2", "Author2");
        // создание списка books типа List<Book> с использованием метода asList класса Arrays.
        List<Book> bookList = Arrays.asList(book1, book2);

        when(bookRepository.addBook()).thenReturn(bookList);

        List<Book> result = bookService.delete();
        // проверка ожидаемого значения (bookList) и фактического значения (result) с помощью метода assertEquals.
        assertEquals(bookList, result);
        // проверка, был ли вызван метод findAll у заглушки bookRepository с параметром id один раз с помощью метода
        // verify и аргумента times(1).
        verify(bookRepository, times(1)).findAll();


    }


