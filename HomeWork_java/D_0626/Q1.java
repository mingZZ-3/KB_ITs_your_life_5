package D_0626;

public class Q1 {
    public static void main(String[] args) {
        Manager emp = new Manager("12345678", "John Doe", "서울시 강남구", 50000, 5000);
        System.out.println(emp.toString());
        emp.test();
    }
}
