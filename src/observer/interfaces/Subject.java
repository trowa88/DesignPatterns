package observer.interfaces;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer observer);

    void notifyObservers();
}
