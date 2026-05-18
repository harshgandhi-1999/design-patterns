package creational.FactoryPattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        // Must read blog for better understanding : https://www.digitalocean.com/community/tutorials/factory-design-pattern-in-java

        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);

        //It promotes loose coupling by delegating object creation to a method,
        // making the system more flexible and extensible.
        // Supports Open/Closed Principle
    }
}
