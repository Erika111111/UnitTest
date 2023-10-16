package seminar2Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar2.Cart;
import seminar2.Product;

import static org.junit.jupiter.api.Assertions.*;

public class cartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach
    // метод тест конструктор
    public void setApp(){
        cart = new Cart();
        product1 = new Product(1, "яблоко", 1.2, 10);
        product2 = new Product(2,"апельсин", 2.1, 15);
    }
    @Test
    // тест метод проверки метода calculateTotal посчитать сумму продуктов
    public void calculateTotalTest(){
        cart.addItem(product1);
        cart.addItem(product2);
        // создаем переменную ожидаемая сумма
        double expectedTotal = 43.5;
        // создаем переменную актуальная сумма
         double actualTotal = cart.calculateTotal();
         assertEquals(expectedTotal, actualTotal, "стоимость корзины не корректна");
    }
}
