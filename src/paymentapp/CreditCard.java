package paymentapp;

public class CreditCard implements Payment{

    private final String cardNumber;
    private final String cardHolder;

    //constructor
    public CreditCard(String cardNumber,String cardHolder){
        this.cardNumber=cardNumber;
        this.cardHolder=cardHolder;
    }

    @Override
    public void pay(double amount){
        System.out.println("Processing credit card payment...");
        System.out.println("Amount: ₹"+amount);
        System.out.println("Paying using card: **** **** **** "+cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Card Holder: "+cardHolder);

    }
}
