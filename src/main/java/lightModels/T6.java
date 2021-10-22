package lightModels;

import holidayLightsPortal.Lightslist;

public class T6 implements Lightslist {
    @Override
    public String lightType() {
        return  "T6";
    }

    @Override
    public int lightPrice() {
        return 600;
    }
}
