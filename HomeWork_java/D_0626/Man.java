package D_0626;

public class Man extends Person {
    private int power;

    public Man(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void run() {
        System.out.println(super.getName() + "이(가) 빠르게 달립니다.");
    }
}
