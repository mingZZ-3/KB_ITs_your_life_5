package D_0626;

public class Manager extends Employee {
    private int bonus;

    public Manager() {
    }

    public Manager(String rrn, String name, String address, int salary, int bonus) {
        super(rrn, name, address, salary);
        this.bonus = bonus;
    }

    public void test() {
        System.out.println("This is a test method in the Manager class.");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee [");
        sb.append("name= ").append(name).append(" ");
        sb.append(", address= ").append(address).append(" ");
        sb.append(", salary= ").append(salary).append("], Manager [");
        sb.append("bonus= ").append(bonus);
        sb.append("]");
        return sb.toString();
    }
}
