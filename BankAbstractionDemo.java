abstract class Bank {
    protected String bankName;

   
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    
    abstract double getRateOfInterest();

   
    public void calculateInterest(double principal, int years) {
        double rate = getRateOfInterest();
        double interest = (principal * rate * years) / 100;
        System.out.println(bankName + " Interest Rate: " + rate + "%");
        System.out.println("Interest earned on $" + principal + " for " + years + " years: $" + interest);
        System.out.println("--------------------------------------------------");
    }
}


class SBI extends Bank {
    public SBI() {
        super("State Bank of India (SBI)");
    }

    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}


class HDFC extends Bank {
    public HDFC() {
        super("HDFC Bank");
    }

    @Override
    double getRateOfInterest() {
        return 7.1;
    }
}


class ICICI extends Bank {
    public ICICI() {
        super("ICICI Bank");
    }

    @Override
    double getRateOfInterest() {
        return 6.9;
    }
}

public class BankAbstractionDemo {
    public static void main(String[] args) {
        double principalAmount = 10000.0;
        int tenureInYears = 3;

       
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        
        sbi.calculateInterest(principalAmount, tenureInYears);
        hdfc.calculateInterest(principalAmount, tenureInYears);
        icici.calculateInterest(principalAmount, tenureInYears);
    }
}
