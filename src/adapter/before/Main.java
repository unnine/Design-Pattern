package adapter.before;

import adapter.before.cable.LightningTypeCable;
import adapter.before.phone.IPhone;

public class Main {

    public static void main(String[] args) {
        /**
         * C 타입 이어폰만 가지고 있기 때문에 이어폰을 사용할 수가 없다.
         */
        LightningTypeCable cable = null;
        IPhone iPhone = new IPhone();
        iPhone.connect(cable);
    }

}