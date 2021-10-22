package lightTypes;

import holidayLightsPortal.Lightslist;
import lightModels.*;

import java.util.ArrayList;
import java.util.List;

public class Cone {
    public List<Lightslist> coneList = new ArrayList<>();

    public Cone() {
        coneList.add(new C7());
        coneList.add(new C9());
        coneList.add(new C6());

    }
}