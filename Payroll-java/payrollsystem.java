class payroll {
    private int empId;
    private String name;
    private double baseSalary;

    public payroll(int empId, String name, double baseSalary) {
        this.empId = empId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmpId() {return empId;}
    public String getName() {return name;}
    public double getBaseSalary() {return baseSalary;}
    public double calculateSalary() {return baseSalary;}
}

class payrollDeveloper extends payroll {
    public payrollDeveloper(int empId, String name, double baseSalary) {
        super(empId, name, baseSalary);
    }
    @Override 
    public double calculateSalary() {return getBaseSalary() + 5000;}
}

class payrollTester extends payroll {
    public payrollTester(int empId, String name, double baseSalary) {
        super(empId, name, baseSalary);
    }
    @Override 
    public double calculateSalary() {return getBaseSalary() + 3000;}
}

class payrollManager extends payroll {
    public payrollManager(int empId, String name, double baseSalary) {
        super(empId, name, baseSalary);
    }
    @Override 
    public double calculateSalary() {return getBaseSalary() + 12000;}
}

public class payrollsystem {
    public static void main(String[] args) {
        payroll[] staff = {
            new payrollDeveloper(101, "Anand", 60000),
            new payrollTester(302, "Menon", 30000),
            new payrollTester(708, "Lenin", 50000)
        };
        for(payroll e: staff) {
            System.out.println("ID: " + e.getEmpId() + " |Name: " + e.getName() + " | Final Salary: Rs. " + e.calculateSalary());
        }
    }
}