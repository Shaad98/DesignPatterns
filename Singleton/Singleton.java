public class Singleton{
    public static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingletonObj()
    {
        if(singleton==null)
        {
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }
}