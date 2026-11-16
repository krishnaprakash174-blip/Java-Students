interface esystem {
    void pay(double amount);
}

class upi implements esystem {
    @Override 
    public void pay(double amount) {
        System.out.println("Paid is. " + amount + " securely using UPI QR/ID.");
    }
}

class creditcard implements esystem {
    @Override 
    public void pay(double amount) {
        System.out.println("Paid is. " + amount + " using credit card (EMI eligible).");
    }
}

class debitcard implements esystem {
    @Override 
    public void pay(double amount) {
        System.out.println("Paid is. " + amount + " directly from bank via debit card.");
    }
}

public class Esystem {
    public static void checkout(esystem method, double amount) {
        method.pay(amount);
    }

    public static void main(String[] args) {
        checkout(new upi(), 780.0);
        checkout(new creditcard(), 15000.0);
        checkout(new debitcard(), 2200.0);
    }
}