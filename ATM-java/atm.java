class atm {
    private int pin = 2002;
    private double balance = 28000.0;

    public void checkbalance(int enteredpin) {
        if(enteredpin == pin) {
            System.out.println("PIN Verified. Available Balance: Rs. " + balance);
        } else {
            System.out.println("Incorrect PIN! Access Denied.");
        }
    }

    public static void main(String[] args) {
        atm atm = new atm();
        atm.checkbalance(4581);
        atm.checkbalance(2002);
    }
}