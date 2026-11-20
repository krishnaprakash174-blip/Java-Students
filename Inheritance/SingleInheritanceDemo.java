class BankAccount {
    String accountNumber = "AC10025";
    double balance = 5000.0;

    void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: $" + balance);
    }
}


class SavingsAccount extends BankAccount {
    double interestRate = 4.5;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Annual Interest Earned: $" + interest);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount();
        mySavings.displayBalance();     
        mySavings.calculateInterest();  
    }
}