package behavioural.MementoPatternApp;

public class Originator {
    private State state;

    public Originator(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }
}
