package liskovsubstitution.good;

class BitcoinPayment implements PaymentMethod {
    // process payment using Bitcoin
    public void processPayment(double amount) {
        System.out.println("payment processed, amount is : " + amount);

    }
}