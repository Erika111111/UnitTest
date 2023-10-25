package seminar4;

// интерфейс платежный шлюз
public interface PaymentGateway {
    // метод обработки платежа
    boolean processPayment(double amount); //количество
}
