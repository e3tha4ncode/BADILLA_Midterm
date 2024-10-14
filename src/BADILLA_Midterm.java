// class Person with properties name and age
class Person {
    String name;
    int age;

    // Display person's information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Initialize person's properties
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// class Student extends Person
class Student extends Person {
    String studentID;
    String course;
    int unit;
    int feePerUnit = 1000; // Default fee

    // Calculate student's fees
    double calculateFees() {
        return unit * feePerUnit;
    }

    // Override displayInfo method to include student-specific information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + unit);
        System.out.println("Total fee: P" + calculateFees());
    }

    // Initialize student's properties
    Student(String name, int age, String studentID, String course, int unit) {
        super(name, age); // Call Person's constructor
        this.studentID = studentID;
        this.course = course;
        this.unit = unit;
    }
}

//Instructor that extends Person
class Instructor extends Person {
    String employeeID;
    String department;
    double salary;

    // Override displayInfo method to include instructor-specific information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: P" + salary);
    }

    //Initialize instructor's properties
    Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Call Person's constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
}

// Main class
public class BADILLA_Midterm {
    // Method to print person's details
    public static void printDetails(Person person) {
        person.displayInfo();
        System.out.println();
    }

    // Test the enrollment system
    public static void main(String[] args) {
        //Student objects
        Student studentOne = new Student("Christian Badilla", 19, "231001719", "BSCpE", 8);
        Student studentTwo = new Student("Jeryl Rizares", 20, "231005500", "BSCpE", 9);
        //Instructor objects
        Instructor instructorOne = new Instructor("Tanya Carmela Jovillano", 22, "231000469", "CEA", 100000);
        Instructor instructorTwo = new Instructor("Sarahlyn Catimbang", 40, "231009760", "CEA", 125000);

        //Enrollment System Header
        System.out.println("-----------------------------");
        System.out.println("----- ENROLLMENT SYSTEM -----");
        System.out.println("-----------------------------");
        System.out.println();

        //Student Details
        System.out.println("---------- STUDENTS ---------");
        System.out.println();
        printDetails(studentOne);
        printDetails(studentTwo);

        //Instructor Details
        System.out.println("-------- INSTRUCTORS --------");
        System.out.println();
        printDetails(instructorOne);
        printDetails(instructorTwo);
    }
}