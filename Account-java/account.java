class account {
    private double balance;

    public account(double initialbalance) {
        if(initialbalance >= 0) this.balance = initialbalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getbalance() {return balance;}
    public static void main(String[] args) {
        account acc = new account(2000);
        acc.deposit(500);
        acc.withdraw(400);
        acc.withdraw(800);
        System.out.println("Current Balance: " + acc.getbalance());
    }
}