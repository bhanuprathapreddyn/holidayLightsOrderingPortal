public class CartOrdered implements CartState{

    @Override
    public String updateState() {
        String state = "Ordered";
        return state;
    }
}
