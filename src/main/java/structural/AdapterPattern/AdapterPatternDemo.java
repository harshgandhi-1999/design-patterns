package structural.AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        // We have only android charger to charge the android phone.
        // We want to charge the iphone;


        // our samsung charger implements the android charging interface
        // i.e. the samsung charger can connect to android phone charging point inside phone
        AndroidChargingInterface samsungCharger = new SamsungCharger();

        // we aldo have iphone interface - i.e. iphone charging point inside iphone
        // but we dont have iphone charger

        // so here we will use adapter to charge the iphone using android charger.
        // we cannot charge iphone with android charger directly since they both
        // are having different interfaces.

        // so we use adapter in between which uses android charger to charge the iphone and also implements iphone charging interface

        ChargingAdapter adapter = new ChargingAdapter(samsungCharger);
        adapter.chargeIphone();

    }
}
