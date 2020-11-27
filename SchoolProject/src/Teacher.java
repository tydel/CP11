/**
 * Instantiated objects of the Teacher class are generally added to the ArrayLists in the School class
 */
public class Teacher {
    // Fields for the Teacher class
    private String firstName;
    private String lastName;
    private String subject;

    // Parameterized constructor
    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    // Overriding toString to display output as requested
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\t" + "Subject: " + subject;
    }

    // Getter and setter for firstName field
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and setter for lastName field
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
