package paymentapp;

public class WalletPayment implements Payment{

    private final String walletName;

    //constructor
    public WalletPayment(String walletName){
        this.walletName = walletName;
    }

    @Override
    public void pay(double amount){
        System.out.println("Processing wallet payment...");
        System.out.println("Amount: " + amount);
        System.out.println("paid using wallet: " + walletName);
    }
}
