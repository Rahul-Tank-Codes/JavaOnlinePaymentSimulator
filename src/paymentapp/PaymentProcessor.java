package paymentapp;

public class PaymentProcessor {

    public void processPayment(Payment paymentMethod, double amount){
        System.out.println("Starting payment process...");
        paymentMethod.pay(amount);
        System.out.println("Payment completed.\n");
    }
}
