package liskovsubstitution.violation;
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
//class BitcoinPayment implements PaymentMethod {
//
//    public void processPayment(double amount, String walletAddress) {
//        // process payment using Bitcoin and the specified wallet address
//             System.out.println("payment processed");
//    }
//}

public class Main {
    public static void main(String[] args){
//        liskovsubstitution.violation.PaymentMethod bitcoin = new liskovsubstitution.violation.BitcoinPayment();
//        bitcoin.processPayment(20.00, "EX2693BKJBSK39");
    }
}
