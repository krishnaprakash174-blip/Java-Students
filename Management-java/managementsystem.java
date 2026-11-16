class management {
    private String accountNumber;
    private double balance;

    public management(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {return accountNumber;}
    public double getBalance() {return balance;}

    public void deposit(double amount) {
        if(amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance in " + accountNumber);
    }

    public double calculateInterest() {
        return 0.0;
    }
}

class SavingsAccount extends management {
    public  SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override 
    public double calculateInterest() {
        return getBalance() * 0.04;
    }
}

class CurrentAccount extends management {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override 
    public double calculateInterest() {
        return getBalance() * 0.01;
    }
}

public class managementsystem {
    public static void main(String[] args) {
        management a1 = new SavingsAccount("SAV101", 25000);
        management a2 = new CurrentAccount("CUR202", 10000);

        a1.deposit(2000);
        a2.withdraw(5000);

        System.out.println("Savings (" + a1.getAccountNumber() + ") Balance: " + a1.getBalance() + " | Interest: " + a1.calculateInterest());
        System.out.println("Savings (" + a2.getAccountNumber() + ") Balance: " + a2.getBalance() + " | Interest: " + a2.calculateInterest());
    }
}