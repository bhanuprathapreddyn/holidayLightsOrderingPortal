package lightModels;

import holidayLightsPortal.Lightslist;

public class G50 implements Lightslist {
    @Override
    public String lightType() {
        return "G50";
    }

    @Override
    public int lightPrice() {
        return 500;
    }
}
