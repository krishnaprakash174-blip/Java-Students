class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    
    public double calculateSalary() {
        return baseSalary;
    }

    public void displaySalary() {
        System.out.println("Employee: " + name + " | Total Salary: $" + calculateSalary());
    }
}


class Developer extends Employee {
    private double projectBonus;

    public Developer(String name, double baseSalary, double projectBonus) {
        super(name, baseSalary);
        this.projectBonus = projectBonus;
    }

    
    @Override
    public double calculateSalary() {
        return baseSalary + projectBonus;
    }
}


class Tester extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Tester(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }


    @Override
    public double calculateSalary() {
        return baseSalary + (overtimeHours * overtimeRate);
    }
}


public class PayrollSystem {
    public static void main(String[] args) {
       
        Employee emp1 = new Developer("Alice", 80000.0, 12000.0);
        Employee emp2 = new Tester("Bob", 65000.0, 20, 50.0);

     
        emp1.displaySalary();
        emp2.displaySalary();
    }
}
