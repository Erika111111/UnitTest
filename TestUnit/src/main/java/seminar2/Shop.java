package seminar2;

import java.util.ArrayList;
import java.util.List;
// класс магазин
public class Shop {
   // поле список товаров
    private List<Product>products;

    // при создании объекта shop автоматически создаем arraylist
    public Shop() {
        this.products = new ArrayList<>();
    }

    //метод добавления товара в список
    public void addProduct(Product product) {
        products.add(product);
    }
}
