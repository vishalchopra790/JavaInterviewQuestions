package naveen;

import java.lang.reflect.Field;

public class StringTranslator {
    static{
        try {
            Field value=String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello",value.get("Hola"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
