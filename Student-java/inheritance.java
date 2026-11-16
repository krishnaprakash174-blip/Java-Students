class Person { 
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println("Person Name " +name+" age is: "+age);
    }
}

class Student extends Person {
    int marks;
    public Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }
    void display() {
        super.display();
        System.out.println(" Student marks " +marks);
    }
}

class inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Krishna", 21, 64);
        s1.display();
    }
}