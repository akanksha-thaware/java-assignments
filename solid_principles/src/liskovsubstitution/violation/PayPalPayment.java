package liskovsubstitution.violation;


class PayPalPayment implements PaymentMethod {
    public void processPayment(double amount) {
        // process payment using PayPal
    }
}