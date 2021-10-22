package lightTypes;

import holidayLightsPortal.Lightslist;
import lightModels.*;

import java.util.ArrayList;
import java.util.List;

public class Tube {
    public List<Lightslist> tubeList = new ArrayList<>();
    public Tube() {
        tubeList.add(new T6());
        tubeList.add(new T50());
    }
}
