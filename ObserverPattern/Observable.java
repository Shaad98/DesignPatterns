import java.util.*;

public class Observable {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void setMessage(String message)
    {
        this.message = message;
        notifyObservers();
    }

    public void notifyObservers()
    {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
