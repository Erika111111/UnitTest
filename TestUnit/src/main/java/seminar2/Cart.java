package seminar2;

import java.util.ArrayList;
import java.util.List;

// класс карзина покупателя
public class Cart {
    // поле список продуктов (карзина покупателя)
    private List<Product> cartItems;

    public Cart(){

        this.cartItems = new ArrayList<>();
    }
    // метод добавления продукта в карзину
    public void addItem(Product product){
        cartItems.add(product);
    }
    // метод удаление продукта из карзины
    public  void removeItem(Product product){
        cartItems.remove(product);
    }
    // посчитать сумму продуктов
    public double calculateTotal() {
        double total = 0.0;
        for (Product item : cartItems) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }


}
