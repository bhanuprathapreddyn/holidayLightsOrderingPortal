package holidayLightsPortal;

public class CartOrdered implements CartState{

    @Override
    public String updateState() {
        return "Ordered";
    }
}
