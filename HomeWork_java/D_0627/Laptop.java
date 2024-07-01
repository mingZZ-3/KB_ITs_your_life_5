package D_0627;

public class Laptop extends DigitalDevice {

    public Laptop(int batteryCapacity, String color) {
        super(batteryCapacity, color);
    }

    public void charge(int additionalCapacity) {
        super.setBatteryCapacity(super.getBatteryCapacity() + additionalCapacity);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tablet{");
        sb.append("batteryCapacity=").append(super.getBatteryCapacity());
        sb.append('}');
        sb.append(" DigitalDevice{");
        sb.append("batteryCapacity=").append(super.getBatteryCapacity());
        sb.append(", color='").append(super.getColor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
