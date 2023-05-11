package liskovsubstitution.good;

interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // process payment using credit card
    }
}

class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // process payment using PayPal
    }
}
class BitcoinPayment implements PaymentMethod {
    // process payment using Bitcoin
    public void processPayment(double amount) {
        System.out.println("payment processed, amount is : " + amount);

    }
}

public class GoodMain {
    public static void main(String[] args) {
        liskovsubstitution.good.PaymentMethod bitcoin = new liskovsubstitution.good.BitcoinPayment();
        bitcoin.processPayment(20.00);
    }
}


