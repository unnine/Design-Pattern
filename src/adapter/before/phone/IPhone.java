package adapter.before.phone;

import adapter.before.cable.LightningTypeCable;

public class IPhone {

    public void connect(LightningTypeCable cable) {
        System.out.println("Connected by " + cable.pin() + " pin.");
    }
}