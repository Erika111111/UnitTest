package seminar4;

// класс платежная система
public class PaymentProcessor {
    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {

        this.gateway = gateway;
    }

   // метод произведения оплаты
    public boolean makePayment(double amount) { //количество

        return gateway.processPayment(amount); // обработка платежа
    }
}
