class University {
    String universityName;
    String location;

    University(String universityName, String location) {
        this.universityName = universityName;
        this.location = location;
    }
    void displayUniversityDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Location :" + location);
    }
}

class Department extends University {
    String departmentName;
    String departmentCode;
    
    Department(String universityName, String location, String departmentName, String departmentCode) {
        super(universityName, location);
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    void displayDepartmentDetails() {
        System.out.println("Department Name : " + departmentName);
        System.out.println("Department Code : " + departmentCode);
    }
}

class Student extends Department {
    int rollNumber;
    String studentName;
    double cgpa;

    Student(String universityName, String location, String departmentName, String departmentCode, int rollNumber, String studentName, double cgpa) {
        super(universityName, location, departmentName, departmentCode);
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.cgpa = cgpa;
    }
    void displayCompleteDetails() {
        System.out.println("==== Student Complete Details ====");
        displayUniversityDetails();
        displayDepartmentDetails();
        System.out.println("Student Name :" + studentName);
        System.out.println("Roll Number :" + rollNumber);
        System.out.println("CGPA :" + cgpa);
        System.out.println("=========");
    }
}

public class inheritanceDemo {
    public static void main(String[] args) {
        Student student1 = new Student("Anna University", "Chennai", "Computer Science Engineering", "CSE-101", 2026045, "Arjun Varma", 8.7);
        student1.displayCompleteDetails();
    }
}