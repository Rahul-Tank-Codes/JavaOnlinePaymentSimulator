package paymentapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner class to take user input
        Scanner scanner = new Scanner(System.in);

        //here the  polymorphism starts
        PaymentProcessor processor = new PaymentProcessor();

        //Loop
        while (true) {

            //Exception handling using custom exception class-InvalidAmountException
            try {
                System.out.println("=== Welcome to Online Payment System ===");

                System.out.println("Choose Payment Method:");
                System.out.println("1. Credit Card");
                System.out.println("2. UPI");
                System.out.println("3. Wallet");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1-4):");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 4) {
                    System.out.println("Exiting Payment System. Thank you!");
                    break;
                }

                Payment payment = null;

                switch (choice) {
                    case 1:
                        System.out.println("Enter Card Number:");
                        String cardNumber = scanner.nextLine();

                        System.out.println("Enter Card Holder Name");
                        String cardHolder = scanner.nextLine();

                        payment = new CreditCard(cardNumber, cardHolder);
                        break;

                    case 2:
                        System.out.println("Enter UPI ID:");
                        String upiId = scanner.nextLine();

                        payment = new UPIPayment(upiId);
                        break;

                    case 3:
                        System.out.println("Enter Wallet Name:");
                        String walletName = scanner.nextLine();

                        payment = new WalletPayment(walletName);
                        break;

                    default:
                        System.out.println("Invalid Choice.");
                        System.exit(0);
                }

                System.out.println("Enter amount to pay: ₹");
                double amount = scanner.nextDouble();

                if(amount <= 0 ){
                    throw new InvalidAmountException("Amount must be greater than 0.");
                }

                processor.processPayment(payment, amount);

            }catch(InvalidAmountException e){
                System.out.println("Payment failed: " + e.getMessage());
            }catch(Exception e){
                System.out.println("Unexpected error: " + e.getMessage());
                scanner.nextLine();
            }
        }

        scanner.close();

    }
}
