package D_0703;

public class Factory {
    public static Food createFood(ObjectType type, String name) {
        Food food = null;
        try {
            Object obj = type.getFoodClass().getDeclaredConstructors()[0].newInstance(name);
            food = (Food) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return food;
    }
}
