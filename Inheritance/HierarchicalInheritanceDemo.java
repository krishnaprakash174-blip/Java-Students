class Employee {
    int empId;
    double salary;

    void showDetails() {
        System.out.println("Employee ID: " + empId + " | Salary: $" + salary);
    }
}


class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer is writing Java backend code.");
    }
}


class Manager extends Employee {
    void conductMeeting() {
        System.out.println("Manager is conducting a project sprint meeting.");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.empId = 101;
        dev.salary = 85000;
        dev.showDetails();      
        dev.writeCode();        

        System.out.println("---");

        Manager mgr = new Manager();
        mgr.empId = 102;
        mgr.salary = 110000;
        mgr.showDetails();      
        mgr.conductMeeting();   
    }
}