package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Remote implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private Button buttonPress;

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void updateObservers() {
        for (Observer o : this.observers) {
            o.update(buttonPress);
        }
    }

    @Override
    public void pressButton(Button buttonPress) {
        this.buttonPress = buttonPress;
        this.updateObservers();
    }
    
}
