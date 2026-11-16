class Employee {
    int employeeId;
    String name;
    double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    void display() {
        System.out.println("EmployeeId: "+ employeeId);
        System.out.println("Name: "+ name);
        System.out.println("BaseSalary: "+ baseSalary);
    }
}

class Manager extends Employee {
    double bonus;
    Manager(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }
    double calculateTotalSalary() {
        return baseSalary + bonus;
    }
    void display() {
        super.display();
        System.out.println("Bonus:" + bonus);
        System.out.println("Total Salary:" + calculateTotalSalary());
    }
}

public class inheritance {
    public static void main(String[] args) {
        Manager mgr = new Manager(13807, "Krishna Prakash", 85000, 20000);
        mgr.display();
    }
}