package Behavioral.Observer;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void updateObservers();
    void pressButton(Button buttonPress);
}
