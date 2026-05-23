//abstract class-provides the outline for all the other classes
abstract class Student {
    // encapsulation-making methods and variables private
    private String name;
    private int age;

    // constructor-assigns values to a class
    public Student(String name, int age) {
        this.name = name;
        this.age = age; // assigning the variables to the class
    }

    // get methods-access to the private variables
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // abstract method
    abstract void displayCourse();

    // method-display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age :" + age);
    }
}

// inheritance-child class takes on the properties of a parent class
class ItStudent extends Student {
    // constructor
    public ItStudent(String name, int age) {
        super(name, age);// this variables have been inherited
    }

    // polymorphism by accessing a private variable
    @Override
    void displayCourse() {
        System.out.println("Course:Information Technology");
    }
}

// main class-execute the entire code
public class Main {
    public static void main(String[] args) {
        // object-execute the classes
        ItStudent s1 = new ItStudent("Ayman", 16);
        // display student details
        s1.displayDetails();
        s1.displayCourse();
        // blank line
        System.out.println();
    }
}