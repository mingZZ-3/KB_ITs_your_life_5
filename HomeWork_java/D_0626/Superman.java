package D_0626;

public class Superman extends Man{
    private boolean sky;

    public Superman(String name, int age, int power, boolean sky) {
        super(name, age, power);
        this.sky = sky;
    }

    public boolean isSky() {
        return sky;
    }

    public void setSky(boolean sky) {
        this.sky = sky;
    }

    public void space() {
        System.out.println(super.getName() + "이(가) 우주를 날아갑니다.");
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("슈퍼맨 [");
        sb.append("name=").append(super.getName());
        sb.append(", age=").append(super.getAge());
        sb.append(", power=").append(super.getPower());
        sb.append(", sky=").append(sky);
        sb.append(']');
        return sb.toString();
    }
}
