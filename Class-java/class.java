class classstudent {
    private String name;
    private int age;
    private double marks;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public double getMarks() {return marks;}
    public void setMarks(double marks) {this.marks = marks;}

    public static void main(String[] args) {
        classstudent cs = new classstudent();
        cs.setName("Sathish");
        cs.setAge(20);
        cs.setMarks(89);
        System.out.println("Name: " + cs.getName() + ", Age: " + cs.getAge() + ", Marks: " + cs.getMarks());
    }
}