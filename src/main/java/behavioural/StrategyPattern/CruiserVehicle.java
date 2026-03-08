package behavioural.StrategyPattern;

import behavioural.StrategyPattern.strategy.NormalDriveStrategy;

public class CruiserVehicle extends Vehicle {

    public CruiserVehicle() {
        super(new NormalDriveStrategy());
    }
}
