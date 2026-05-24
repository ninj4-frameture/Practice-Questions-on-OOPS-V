import java.util.ArrayList;//importing anaarray to store more than one value
//course class

class Course {
    // private variables
    private String name;
    private int credits;
    private double grade;

    // constructor
    public Course(String name, int credits, double grade) {
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    // setter method-used to assign values to a private variable
    public void setgrade(double grade) {
        this.grade = grade;
    }

    // getter
    public double getgrade() {
        return grade;
    }

    public int getcredits() {
        return credits;
    }

    // method-convert a numerical grade to a text grade
    public String getLetterGrade() {
        if (grade >= 4.0)
            return "A";
        else if (grade >= 3.7)
            return "A-";
        else if (grade >= 3.3)
            return "B";
        else if (grade >= 3.0)
            return "B";
        else if (grade >= 2.7)
            return "B-";
        else
            return "C";
    }
}

// student class
class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;// access all the details from course class and display them here
    // Constructor

    public Student(String name, int id) {
        // Store student name and ID
        this.name = name;
        this.id = id;
        // Create empty course list
        courses = new ArrayList<>();
    }

    // method to add a course to the list
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method to remove course
    public void removeCourse(Course course) {
        // Remove course from list
        courses.remove(course);
    }
}