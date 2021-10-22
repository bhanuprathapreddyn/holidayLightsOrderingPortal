public class EmptyCart implements CartState{

    @Override
    public String updateState() {
        String state = "Empty";
        return state;
    }
}
