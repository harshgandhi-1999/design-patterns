package structural.DecoratorPattern;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with milk";
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost() + 20;
    }
}
