package structural.AdapterPattern;

public class SamsungCharger implements AndroidChargingInterface {

    @Override
    public void chargePhone() {
        System.out.println("Charging with Samsung android charger");
    }
}
