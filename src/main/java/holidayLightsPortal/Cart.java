package holidayLightsPortal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cart implements CartState{
    CartState cs;
    String state = String.valueOf(new EmptyCart());
    public List<String> itemsInCart;
    public List<Integer> itemPriceInCart;

    @Override
    public String toString() {
        return "Cart{" +
                "cs=" + cs +
                ", state='" + state + '\'' +
                ", itemnamecart=" + itemsInCart +
                ", itempricecart=" + itemPriceInCart +
                '}';
    }

    public Cart(){
        itemsInCart = new ArrayList<>();
        itemPriceInCart = new ArrayList<>();
    }
    public void addItem(String item, int price, int quantity){
        for (int  i=0 ; i<quantity; i++){
            itemsInCart.add(item);
            itemPriceInCart.add(price);
        }
        state = String.valueOf(new ReadyToOrder());
        System.out.println("Ready to Order");
    }
//    public void orderSummary(Cart c){
//        int quantity = 1;
//        for (int i = 0; i< itemnamecart.size(); i++){
//            if(i != itemnamecart.size()-1) {
//                if (itemnamecart.get(i).equals(itemnamecart.get(i + 1))) {
//                    quantity++;
//                }
//                else{
//                    System.out.println( "Light Model: " + itemnamecart.get(i) + " " +"Quantity: " + quantity + " " + "Price: " + quantity* itempricecart.get(i) +" USD");
//                    quantity  = 1;
//                }
//            }
//            else{
//                System.out.println("Light Model: " + itemnamecart.get(i) + " " +"Quantity: " + quantity + " " + "Price: " + quantity* itempricecart.get(i) +" USD");
//                quantity  = 1;
//            }
//        }
//        int totalprice = 0;
//        for (int i = 0; i<itempricecart.size(); i++){
//            totalprice = totalprice + itempricecart.get(i);
//        }
//        System.out.println("-----------------------------");
//        System.out.println("Number of items: " + itemnamecart.size() +  "\t\t " +"Total Price: " + totalprice + " USD");
//    }
//    public void editOrder(Cart c) {
//        System.out.println("0) Exit");
//        for (int i = 0; i < itemsInCart.size(); i++) {
//            System.out.println((i + 1) + ") " + itemsInCart.get(i) + "\t\t" + itemPriceInCart.get(i) + " USD");
//        }
//        System.out.print("Which light do you want to remove? Enter Option: ");
//        Scanner s3 = new Scanner(System.in);
//        int inp = s3.nextInt();
//        if (inp != 0) {
//            itemsInCart.remove(inp - 1);
//            itemPriceInCart.remove(inp - 1);
//            int quantity = 1;
//            for (int i = 0; i < itemsInCart.size(); i++) {
//                if (i != itemsInCart.size() - 1) {
//                    if (itemsInCart.get(i).equals(itemsInCart.get(i + 1))) {
//                        quantity++;
//                    } else {
//                        System.out.println(quantity + " " + itemsInCart.get(i) + " " + quantity * itemPriceInCart.get(i));
//                        quantity = 1;
//                    }
//                } else {
//                    System.out.println(quantity + " " + itemsInCart.get(i) + " " + quantity * itemPriceInCart.get(i));
//                    quantity = 1;
//                }
//            }
//            System.out.println("Cart Updated");
//        }
//        else{
//            System.out.println("Cart Updated");
//        }
//    }

    @Override
    public String updateState() {
        return null;
    }
    //Singleton Class - Only one instance of cart is allowed
public static Cart cartInstance;
    public static Cart getInstance(){
       cartInstance = new Cart();
       return cartInstance;

    }
}
