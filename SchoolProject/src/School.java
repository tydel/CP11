import java.util.ArrayList;

/**
 * School class used in SchoolProject to hold three ArrayLists, one each for teachers, students, and courses.
 */

public class School {
    // Create the ArrayLists as per the instructions
    ArrayList<Teacher>teachers = new ArrayList<>();
    ArrayList<Student>students = new ArrayList<>();
    // TODO: Figure out why the ArrayList "courses" is here and never used?
    ArrayList<String>courses = new ArrayList<>();

    // Create out 3 additional fields, private of course
    private String name;
    private String address;
    private Integer capacity;

    // Create the parameterized constructor
    public School(String name, String address, Integer capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    // Methods related to teachers
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void deleteTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }


    // Methods related to students
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }


    // Getter and setter methods for the three additional fields: name, address, and capacity
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) { this.address = address; }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
