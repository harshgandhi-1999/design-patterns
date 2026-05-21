package behavioural.MementoPatternApp;

public class MementoPatternDemo {

    public static void main(String[] args) {
        State state = new State("Initial state");
        Originator originator = new Originator(state);
        CareTaker careTaker = new CareTaker();

        // Write some content
        originator.setState(new State("Updated State"));
        careTaker.addMemento(originator.createMemento());

        System.out.println(originator.getState().getContent());

        // Write more content
        originator.setState(new State("More content"));
        careTaker.addMemento(originator.createMemento());

        System.out.println(originator.getState().getContent());

        // Restore to previous state
        Memento previousMemento = careTaker.undo();
        originator.restoreMemento(previousMemento);

        // Print document content
        System.out.println(originator.getState().getContent());
    }
}
