import java.util.ArrayList;

/**
 * SchoolProject Main class which operates the requested
 * actions against the related classes School, Teacher, and Student
 */
public class Main {
    public static void main(String[] args) {
        // Create the school object that we'll be populating with data
        School happyrock = new School("Gladstone Secondary School", "1234 Main Street", 1300);

        // Creating 10 students as per instructions
        Student tyler_delane = new Student("Tyler", "Delane", 8);
        Student jason_priest = new Student("Jason", "Priest", 8);
        Student sukhh_grewal = new Student("Sukhh", "Grewal", 9);
        Student mira_sanchez = new Student("Mira", "Sanchez", 9);
        Student james_smithe = new Student("James", "Smithr", 10);
        Student john_johnson = new Student("John", "Johnson", 10);
        Student robert_wills = new Student("Robert", "Wills", 11);
        Student michael_bown = new Student("Michael", "Bown", 11);
        Student william_jons = new Student("William", "Jons", 12);
        Student josej_garcia = new Student("Josej", "Garcia", 12);

        // Adding those 10 students to the school
        happyrock.addStudent(tyler_delane);
        happyrock.addStudent(jason_priest);
        happyrock.addStudent(sukhh_grewal);
        happyrock.addStudent(mira_sanchez);
        happyrock.addStudent(james_smithe);
        happyrock.addStudent(john_johnson);
        happyrock.addStudent(robert_wills);
        happyrock.addStudent(michael_bown);
        happyrock.addStudent(william_jons);
        happyrock.addStudent(josej_garcia);

        // Creating 3 teachers as per specifications
        Teacher mrDingDango = new Teacher("Ding", "Dango", "Mathematics 12");
        Teacher mrJackFrost = new Teacher("Jack", "Frost", "Science 11");
        Teacher mrJoeSmithe = new Teacher("Joe", "Smithe", "Career and Personal Planning 11");

        // Adding the 3 teachers to the school
        happyrock.addTeacher(mrDingDango);
        happyrock.addTeacher(mrJackFrost);
        happyrock.addTeacher(mrJoeSmithe);

        displayLists(happyrock);

        happyrock.deleteStudent(james_smithe);
        happyrock.deleteStudent(robert_wills);
        happyrock.deleteTeacher(mrJackFrost);

        displayLists(happyrock);
    }

    // Separate out the logic and overhead from Main of printing the
    // teacher and student ArrayLists returned by the class getters
    public static void displayLists(School school) {
        System.out.println("List of the students:");

        ArrayList<Student> students = school.getStudents();
        for (Student student : students) {
            System.out.println("\t" + student);
        }

        System.out.println("List of the teachers:");

        ArrayList<Teacher> teachers = school.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println("\t" + teacher);
        }

        System.out.println();
    }

}
