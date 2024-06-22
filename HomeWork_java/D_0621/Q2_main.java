package D_0621;

public class Q2_main {

    public static void main(String[] args) {
        Course course = new Course("Programming");
        course.addStudent(new Student("Kim", "Computer Science"));
        course.addStudent(new Student("Park", "Computer Science"));
        course.addSubject(new Subject("Java"));
        course.addSubject(new Subject("Python"));
        System.out.println(course.toString());
    }
}