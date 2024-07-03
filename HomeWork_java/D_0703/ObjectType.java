package D_0703;

public enum ObjectType {
    BANANA(Banana.class), APPLE(Apple.class), ICE(Ice.class);

    private final Class<?> foodClass;
    ObjectType(Class<?> foodClass) { this.foodClass = foodClass; }
    public Class<?> getFoodClass() { return foodClass; }
}
