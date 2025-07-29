public class Main {
   
    public static void main(String[] args) {
        
        Singleton singleton1 = Singleton.getSingletonObj();
        Singleton singleton2 = Singleton.getSingletonObj();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        
    }
}
