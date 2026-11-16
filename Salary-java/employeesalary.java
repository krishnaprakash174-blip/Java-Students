class salary {
    String name;
    double baseSalary;

    salary(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class manager extends salary {
    double bonus;

    manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }
    @Override 
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class developer extends salary {
    double overtimePay;

    developer(String name, double baseSalary, double overtimePay) {
        super(name, baseSalary);
        this.overtimePay = overtimePay;
    }
    @Override 
    public double calculateSalary() {
        return baseSalary + overtimePay;
    }
}

public class employeesalary {
    public static void main(String[] args) {
        salary m = new manager("Murugan", 70000, 20000);
        salary d = new developer("Thangaraj", 50000, 10000);
        System.out.println(m.name + " salary: " + m.calculateSalary());
        System.out.println(d.name + " salary: " + d.calculateSalary());
    }
}