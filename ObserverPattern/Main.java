public class Main{
    public static void main(String[] args) {
        Observer concreteObserver1 = new ConcreteObserver("Observer1");
        Observer concreteObserver2 = new ConcreteObserver("Observer2");

        Observable observable = new Observable();
        observable.addObserver(concreteObserver1);
        observable.addObserver(concreteObserver2);

        observable.setMessage("Hello world!");
    }
}