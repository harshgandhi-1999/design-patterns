package behavioural.MementoPatternApp;

public class Memento {

    // memento object will hold the state of object

    private State state;  // this is state (state can be any variable)

    public Memento(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
