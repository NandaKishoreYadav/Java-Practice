package OOPS;  // Package declaration

// Class Student represents a student entity with attributes like name, roll number, branch, CGPA, and education level
class Student {
    // Instance variables
    String name;    // Name of the student
    int roll_no;    // Roll number of the student
    String branch;  // Branch (department) of the student
    double cgpa;    // CGPA (Cumulative Grade Point Average) of the student
    
    // Static variable shared by all instances of the class
    static String Edu;  // Educational qualification (common for all students)

    // Static block to initialize static variables (runs only once when the class is loaded)
    static {
        Edu = "B.Tech";  // All students are assumed to be pursuing B.Tech
    }
    
    // Parameterized constructor that allows creating a Student object with specific details
    public Student(String name, int roll_no, String branch, double cgpa) {
        this.name = name;        // Assign name to the instance variable
        this.roll_no = roll_no;  // Assign roll number to the instance variable
        this.branch = branch;    // Assign branch to the instance variable
        this.cgpa = cgpa;        // Assign CGPA to the instance variable
    }

    // Default constructor that initializes the student with default values
    public Student() {
        this.name = "Unknown";   // Default name
        this.roll_no = 0;        // Default roll number
        this.cgpa = 0.0;         // Default CGPA
        this.branch = "Unknown"; // Default branch
    }
}

// In Java, a default (no-argument) constructor is automatically provided only if you do not define any constructors in your class

public class OOPS {  // Main class

    public static void main(String[] args) {
        // Create a student object s1 using the parameterized constructor
        Student s1 = new Student("Nanda Kishore", 230, "EEE", 8.64);
        
        // Print the details of student s1
        System.out.print("Name : " + s1.name + "\nRoll No : " + s1.roll_no + "\nCGPA : " + s1.cgpa);
        
        // Create another student object s2 using the default constructor
        Student s2 = new Student();
        
        // Print the details of student s2 (default values will be printed)
        System.out.print("\nName : " + s2.name + "\nRoll No : " + s2.roll_no + "\nCGPA : " + s2.cgpa);
    }

}
