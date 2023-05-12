package liskovsubstitution.good;

public class GoodMain {
    public static void main(String[] args) {
        PaymentMethod bitcoin = new BitcoinPayment();
        bitcoin.processPayment(20.00);
    }
}
