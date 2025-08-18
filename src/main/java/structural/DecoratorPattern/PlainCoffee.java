package structural.DecoratorPattern;

public class PlainCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "This is plain coffee";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
