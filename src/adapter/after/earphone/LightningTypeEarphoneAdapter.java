package adapter.after.earphone;

import adapter.after.cable.LightningTypeCable;
import adapter.after.cable.CTypeCable;

public class LightningTypeEarphoneAdapter implements LightningTypeCable {

    private final CTypeCable cable;

    public LightningTypeEarphoneAdapter(CTypeCable cable) {
        this.cable = cable;
    }

    @Override
    public int pin() {
        return cable.pin() - 16;
    }
}