package behavioural.MementoPatternApp;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private final List<Memento> history;

    public CareTaker() {
        this.history = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        history.add(memento);
    }

    public Memento getMemento(int index){
        return history.get(index);
    }

    public Memento undo(){
        Memento lastMemento = history.get(history.size()-1);
        history.remove(lastMemento);
        return history.get(history.size()-1);
    }
}
