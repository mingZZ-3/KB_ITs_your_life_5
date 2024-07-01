package D_0627;

public class Tablet extends DigitalDevice {
    private boolean isConnected;

    public Tablet(int batteryCapacity, String color, boolean isConnected) {
        super(batteryCapacity, color);
        this.isConnected = isConnected;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tablet{");
        sb.append("isConnected=").append(isConnected);
        sb.append('}');
        sb.append(" DigitalDevice{");
        sb.append("batteryCapacity=").append(super.getBatteryCapacity());
        sb.append(", color='").append(super.getColor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
