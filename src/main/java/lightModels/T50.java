package lightModels;

import holidayLightsPortal.Lightslist;

public class T50 implements Lightslist {
    @Override
    public String lightType() {
        return  "T50";
    }

    @Override
    public int lightPrice() {
        return 700;
    }
}
