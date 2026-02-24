import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Apple apple = new Apple();
        System.out.println(apple.getColor()); //Green

        Class metadata = apple.getClass();

        Field fieldColor = metadata.getDeclaredField("color");
        fieldColor.setAccessible(true);
        fieldColor.set(apple, "RED");
        fieldColor.setAccessible(false);

        System.out.println(apple.getColor());
    }
}
