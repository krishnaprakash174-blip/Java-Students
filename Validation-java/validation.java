class validation {
    private double salary;

    public double getSalary() {return salary;}

    public void setsalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated to: " + this.salary);
        } else {
            System.out.println("Invalid salary! Must be greater than zero.");
        }
    }

    public static void main(String[] args) {
        validation val = new validation();
        val.setsalary(-5000);
        val.setsalary(45000);
    }
}