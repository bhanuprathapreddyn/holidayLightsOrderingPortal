package holidayLightsPortal;

public class ReadyToOrder implements CartState{
    @Override
    public String updateState() {
        return "Ready to Order";
    }
}
