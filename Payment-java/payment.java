class payment {
    public void processpayment(double amount) {
        System.out.println("Processing cash payment of Rs. " + amount);
    }

    public void processpayment(String upiId, double amount) {
        System.out.println("Processing UPI payment of Rs. " + amount + "via" + upiId);
    }

    public void processpayment(String cardNumber, int cvv, double amount) {
        System.out.println("Processing Card Payment of Rs. " + amount + "using card ending in" + cardNumber.substring(cardNumber.length() - 4));
    }

    public static void main(String[] args) {
        payment p = new payment();
        p.processpayment(500.0);
        p.processpayment("user@okaxis", 1200.50);
        p.processpayment("123456789012345", 456, 2500.0);
    }
}