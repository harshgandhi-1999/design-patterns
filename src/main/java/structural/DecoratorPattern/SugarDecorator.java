package structural.DecoratorPattern;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with sugar";
    }

    @Override
    public int getCost() {
        return decoratedCoffee.getCost() + 10;
    }
}
