class hospitalsystem {
    private int empId;
    private String name;
    private double salary;

    public hospitalsystem(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpId() { return empId; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public double calculateSalary() { return salary; }

    public void displayDetails() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Total Salary: Rs." + calculateSalary());
    }
}

class doctor extends hospitalsystem {
    public doctor(int empId, String name, double salary) { super(empId, name, salary); }

    @Override 
    public double calculateSalary() { return getSalary() + 25000; }
}

class nurse extends hospitalsystem {
    public nurse(int empId, String name, double salary) { super(empId, name, salary); }

    @Override 
    public double calculateSalary() { return getSalary() + 2000; }
}

class receptionist extends hospitalsystem {
    public receptionist(int empId, String name, double salary) { super (empId, name, salary); }

    @Override 
    public double calculateSalary() { return getSalary() + 5000; }
}

public class hospitalmanagement {
    public static void main(String[] args) {
        hospitalsystem[] staff = {
            new doctor(201, "Dr.Harish", 78000),
            new nurse(286, "Sister Kavitha", 25000),
            new receptionist(312, "Neha", 20000)
        };

        for (hospitalsystem emp : staff) {
            emp.displayDetails();
        }
    }
}