package holidayLightsPortal;

public class EmptyCart implements CartState{

    @Override
    public String updateState() {
        return "Empty";
    }
}
