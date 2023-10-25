package seminar4Test;

import seminar4.PaymentGateway;

public class DummyPaymentGateway implements PaymentGateway {
    @Override
    public boolean processPayment(double amount) {
        return true;
    }


}
