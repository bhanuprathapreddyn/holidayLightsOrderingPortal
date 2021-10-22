package lightTypes;

import holidayLightsPortal.Lightslist;
import lightModels.*;

import java.util.ArrayList;
import java.util.List;


public class ShortRound {
    public List<Lightslist> shortRoundList = new ArrayList<>();

    public ShortRound() {
        shortRoundList.add(new S11());
        shortRoundList.add(new S14());
    }
}
