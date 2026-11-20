class Employee {
  private int employeeId;
  private String employeeName;
  private double monthlySalary;

  public Employee(int employeeId, String employeeName, double monthlySalary) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.monthlySalary = monthlySalary;
  }

  public int getemployeeId() {
    return employeeId;
  }
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getemployeeName() {
    return employeeName;
  }
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public double getmonthlySalary() {
    return monthlySalary;
  }
  public void setmonthlySalary(double monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  public double calculateAnnualSalary() {
    return this.monthlySalary * 12;
  }

  public void displayDetails() {
    System.out.println("Employee ID    : " + employeeId);
    System.out.println("Employee Name  : " + employeeName);
    System.out.printf("Monthly Salary : $%.2f%n", monthlySalary);
    System.out.printf("Annual Salary  : $%.2f%n", calculateAnnualSalary());
    System.out.println("---------------------------------");
  }
}

public class employeedetails {
  public static void main(String[] args) {
    Employee emp1 = new Employee(101, "Alice", 5000.00);
    Employee emp2 = new Employee(102, "David", 8600.00);
    Employee emp3 = new Employee(103, "David", 4300.00);

    emp3.setmonthlySalary(4500.00);

    System.out.println("=== Employee Payroll Details ===");
    emp1.displayDetails();
    emp2.displayDetails();
    emp3.displayDetails();
  }
}