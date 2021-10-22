package lightTypes;

import holidayLightsPortal.Lightslist;
import lightModels.G30;
import lightModels.G50;

import java.util.ArrayList;
import java.util.List;

public class Globe {
    public List<Lightslist> globeList = new ArrayList<>();
    public Globe() {
        globeList.add(new G30());
        globeList.add(new G50());
    }

}
