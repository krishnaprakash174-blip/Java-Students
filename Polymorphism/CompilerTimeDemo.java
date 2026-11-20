class PaymentProcessor {

    
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
    }

    
    public void processPayment(double amount, String cardNumber) {
        System.out.println("Processing card payment of $" + amount + " using card: " + cardNumber);
    }

    
    public void processPayment(String walletId, double amount) {
        System.out.println("Processing digital wallet (" + walletId + ") payment of $" + amount);
    }
}

public class CompileTimeDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        
        processor.processPayment(50.00);
        processor.processPayment(120.75, "4111-XXXX-XXXX-1234");
        processor.processPayment("user@upi", 35.50);
    }
}