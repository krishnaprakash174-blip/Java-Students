class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Cuurent Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;   
    }

    public void calculateAndAddInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: $" + interest);
    }
}

public class inheritance {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("SB1001", 20000.0, 5.0);
        
        System.out.println("--- Initial Account Details ---");
        myAccount.displayBalance();
        
        System.out.println("\n--- Performing Transactions ---");
        myAccount.deposit(8000.0);
        myAccount.calculateAndAddInterest();

        System.out.println("\n--- Updated Account Details ---");
        myAccount.displayBalance();
    }
}