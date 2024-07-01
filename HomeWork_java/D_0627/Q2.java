package D_0627;

public class Q2 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone(80, "red", 20);
        Tablet tablet = new Tablet(70, "blue", false);
        Laptop laptop = new Laptop(100, "silver");

        System.out.println(smartPhone.toString());
        System.out.println(tablet.toString());
        System.out.println(laptop.toString());
    }
}
