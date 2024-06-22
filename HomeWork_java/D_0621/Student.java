package D_0621;

public class Student {
    private int id;
    private String name;
    private int grade;
    private String department;

    public Student() {}

    public Student(String name, String department) {
        this.department = department;
        this.name = name;
    }

    public Student(int id, String name, int grade, String department) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student : ");
        sb.append(name);
        sb.append(" - ").append(department);
        return sb.toString();
    }
}
