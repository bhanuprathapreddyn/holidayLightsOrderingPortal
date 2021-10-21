import java.util.ArrayList;

public class SummaryIterator implements cartIterator {

    public SummaryIterator() {
    }

    public void orderSummary(Cart c){
        int quantity = 1;
        for (int i = 0; i< c.itemnamecart.size(); i++){
            if(i != c.itemnamecart.size()-1) {
                if (c.itemnamecart.get(i).equals(c.itemnamecart.get(i + 1))) {
                    quantity++;
                }
                else{
                    System.out.println( "Light Model: " + c.itemnamecart.get(i) + " " +"Quantity: " + quantity + " " + "Price: " + quantity* c.itempricecart.get(i) +" USD");
                    quantity  = 1;
                }
            }
            else{
                System.out.println("Light Model: " + c.itemnamecart.get(i) + " " +"Quantity: " + quantity + " " + "Price: " + quantity* c.itempricecart.get(i) +" USD");
                quantity  = 1;
            }
        }
        int totalprice = 0;
        for (int i = 0; i<c.itempricecart.size(); i++){
            totalprice = totalprice + c.itempricecart.get(i);
        }
        System.out.println("-----------------------------");
        System.out.println("Number of items: " + c.itemnamecart.size() +  "\t\t " +"Total Price: " + totalprice + " USD");
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}