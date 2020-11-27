import java.util.UUID;

/**
 * Instantiated objects of the Student class are generally added to the ArrayLists in the School class
 */
public class Student {
    // Define our fields for this class
    private String firstName;
    private String lastName;
    private Integer grade;
    private String studentNumber;

    // Parameterized constructor, called when the object is created in Main
    Student(String firstName, String lastName, Integer grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.studentNumber = UUID.randomUUID().toString();
    }

    // Overriding toString to display output format as requested (Name: {name}\tGrade: {grade})
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\t" + "Grade: " + grade + "\tStudent ID: " + studentNumber;
    }

    // Getters and setters for the fields listed above
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getStudentNumber() {
        return studentNumber;
    }
}
