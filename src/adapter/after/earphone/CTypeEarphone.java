package adapter.after.earphone;

import adapter.after.cable.CTypeCable;

public class CTypeEarphone implements CTypeCable {

    @Override
    public int pin() {
        return 24;
    }
}