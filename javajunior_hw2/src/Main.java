import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Получаем класс String
        Class<String> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getMethods();

        // Выводим на экран все методы
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
