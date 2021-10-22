import java.util.ArrayList;
import java.util.List;

public class Globe {
    List<lightslist> globelist = new ArrayList<>();
    public Globe() {
        globelist.add(new G30());
        globelist.add(new G50());
    }

}
