package D_0620;

public class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("");
        sb.append(name).append(" : ");
        sb.append(price);
        return sb.toString();
    }
}
