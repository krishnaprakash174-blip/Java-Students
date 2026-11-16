class Hospital {
    protected String name;
    protected int employeeId;
    protected String department;

    public Hospital(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name : " + name);
        System.out.println("Department : " + department);
    }

    public void displayResponsibilities() {
        System.out.println("Responsibilities: General hospital operations and support.");
    }
}

class Doctor extends Hospital {
    private String specialization;
    public Doctor(String name, int employeeId, String department, String specialization) {
        super(name, employeeId, department);
        this.specialization = specialization;
    }

    @Override 
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Doctor");
        System.out.println("Specialization: " + specialization);
    }

    @Override 
    public void displayResponsibilities() {
        System.out.println("Responsibilities: Diagnosing illnesses, prescribing treatments, and performing medical procedures.");
    }
}

class Nurse extends Hospital {
    private String shift;
    public Nurse(String name, int employeeId, String department, String shift) {
        super(name, employeeId, department);
        this.shift = shift;
    }

    @Override 
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role : Nurse");
        System.out.println("Shift : " + shift);
    }

    @Override 
    public void displayResponsibilities() {
        System.out.println("Responsibilities: Monitoring patient vitals, administering medication, and assisting doctors.");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Dr. Priya", 102, "Cardiology", "Cardiologist");
        Nurse nurse = new Nurse("Keerthana", 201, "Emergency Care", "Night Shift");

        System.out.println("--- Doctor Profile ---");
        doc.displayDetails();
        doc.displayResponsibilities();

        System.out.println("\n --- Nurse Profile ---");
        nurse.displayDetails();
        nurse.displayResponsibilities();
    }
}