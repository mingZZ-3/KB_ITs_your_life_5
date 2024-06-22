package D_0621;

public class Course {
    private String courseName;
    private static int maxStudents;
    private static int currentStudents;
    private static int currentSubjects;
    private Student[] students;
    private Subject[] subjects;

    static {
        maxStudents = 5;
        currentStudents = 0;
        currentSubjects = 0;
    }

    public Course() {
        students = new Student[maxStudents];
        subjects = new Subject[maxStudents];
    }

    public Course(String courseName) {
        this.courseName = courseName;
        students = new Student[maxStudents];
        subjects = new Subject[maxStudents];
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static int getCurrentStudents() {
        return currentStudents;
    }

    public static void setCurrentStudents(int currentStudents) {
        Course.currentStudents = currentStudents;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students[currentStudents] = student;
        currentStudents++;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void addSubject(Subject subject) {
        subjects[currentSubjects] = subject;
        currentSubjects++;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append("courseName : ").append(courseName).append('\n');
        sb.append("maxStudents : ").append(maxStudents).append('\n');
        sb.append("currentStudents : ").append(currentStudents).append('\n');

        for(int i = 0; i < currentStudents; i++) {
            sb.append(students[i].toString()).append('\n');
        }

        for(int i = 0; i < currentSubjects; i++) {
            sb.append(subjects[i].toString()).append('\n');
        }

        return sb.toString();
    }
}
