package structural.AdapterPattern;

public class ChargingAdapter implements IphoneChargingInterface{

    private final AndroidChargingInterface androidCharger;

    public ChargingAdapter(AndroidChargingInterface androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIphone() {
        System.out.println("Charging iphone with adapter");
        androidCharger.chargePhone();
    }
}
