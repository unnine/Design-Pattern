package adapter.after;

import adapter.after.cable.LightningTypeCable;
import adapter.after.earphone.CTypeEarphone;
import adapter.after.earphone.LightningTypeEarphoneAdapter;
import adapter.after.phone.IPhone;

public class Main {

    public static void main(String[] args) {
        /**
         * C 타입 이어폰만 가지고 있기 때문에 이어폰을 사용할 수가 없다.
         */
        LightningTypeCable cable = new LightningTypeEarphoneAdapter(new CTypeEarphone());
        IPhone iPhone = new IPhone();
        iPhone.connect(cable);
    }

}