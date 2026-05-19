package structural.AdapterPattern;


// Here Adapter implements the target interface
public class ChargingAdapter implements IphoneChargingInterface{

    // this is Adaptee - the existing class which is incompatible that needs integration
    // so we have android charger which is incompatible to iphone charging interface
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
