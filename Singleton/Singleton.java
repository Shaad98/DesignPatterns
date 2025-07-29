public class Singleton{
    public static Singleton singleton = new Singleton();

    private Singleton(){
        if(singleton!=null)
        {
            throw new RuntimeException("You will not break it using reflection!");
        }
    }

    public static Singleton getSingletonObj()
    {
        return singleton;
    }
}