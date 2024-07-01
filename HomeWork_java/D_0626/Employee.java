package D_0626;

public class Employee {
    private String rrn;
    public String name;
    String address;
    protected int salary;

    public Employee() {
    }

    public Employee(String rrn, String name, String address, int salary) {
        this.rrn = rrn;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
