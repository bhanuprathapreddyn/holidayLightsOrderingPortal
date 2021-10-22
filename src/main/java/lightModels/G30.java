package lightModels;

import holidayLightsPortal.Lightslist;

public class G30 implements Lightslist {
    @Override
    public String lightType() {
        return "G30";
    }

    @Override
    public int lightPrice() {
        return 550;
    }
}
