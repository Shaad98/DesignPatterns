import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

        Singleton singleton1 = Singleton.getSingletonObj();
        Singleton singleton2 = Singleton.getSingletonObj();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true); // bypass private access

        Singleton reflectionInstance = constructor.newInstance();

        System.out.println("Reflection instance:");
        System.out.println(reflectionInstance.hashCode());
    }
}
