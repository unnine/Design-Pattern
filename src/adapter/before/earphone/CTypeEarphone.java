package adapter.before.earphone;

import adapter.before.cable.CTypeCable;

public class CTypeEarphone implements CTypeCable {

    @Override
    public int pin() {
        return 24;
    }
}