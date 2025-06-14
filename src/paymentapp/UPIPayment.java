package paymentapp;

public class UPIPayment implements Payment{

    private String upiId;

    //constructor
    public UPIPayment(String upiId){
        this.upiId=upiId;
    }

    @Override
    public void pay(double amount){
        System.out.println("Processing UPI payment...");
        System.out.println("Amount: " + amount);
        System.out.println("Paid using UPI ID: " + upiId);
    }
}
