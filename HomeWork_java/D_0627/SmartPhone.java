package D_0627;

public class SmartPhone extends DigitalDevice{
    private int cameraResolution;


    public SmartPhone(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SmartPhone{");
        sb.append("cameraResolution=").append(cameraResolution);
        sb.append('}');
        sb.append(" DigitalDevice{");
        sb.append("batteryCapacity=").append(super.getBatteryCapacity());
        sb.append(", color='").append(super.getColor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
