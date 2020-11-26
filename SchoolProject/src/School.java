import java.util.ArrayList;

public class School {
    ArrayList<Student>students = new ArrayList<>();
    ArrayList<Teacher>teachers = new ArrayList<>();
    ArrayList<Course>courses = new ArrayList<>();

    String name = "Gladstone Secondary School";
    String address = "4105 Gladstone St, Vancouver, BC V5N 4Z2";
    Integer capacity = 1200;

    // Fields and methods related to students
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }


    // Fields and methods related to teachers
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void deleteTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }


    // Fields and methods related to courses
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void deleteCourse(Course course) {
        this.courses.remove(course);
    }


    // Get and set methods for the three additional fields: name, address, and capacity
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
