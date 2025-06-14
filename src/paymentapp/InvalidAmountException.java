package paymentapp;

public class InvalidAmountException extends Exception{

    //message will be declared when this exception will be thrown
    public InvalidAmountException(String message){
        super(message);
    }
}
