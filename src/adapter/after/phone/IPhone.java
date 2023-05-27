package adapter.after.phone;

import adapter.after.cable.LightningTypeCable;

public class IPhone {

    public void connect(LightningTypeCable cable) {
        System.out.println("Connected by " + cable.pin() + " pin.");
    }
}