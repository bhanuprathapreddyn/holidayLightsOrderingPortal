package holidayLightsPortal;

import java.util.Scanner;

public class CartActions{

    public CartActions() {
    }

    public void orderSummary(Cart c){
        int quantity = 1;
        for (int i = 0; i< c.itemsInCart.size(); i++){
            if(i != c.itemsInCart.size()-1) {
                if (c.itemsInCart.get(i).equals(c.itemsInCart.get(i + 1))) {
                    quantity++;
                }
                else{
                    System.out.println( "Light Model: " + c.itemsInCart.get(i) + " " +"Quantity: " + quantity + " " + "Price: " + quantity* c.itemPriceInCart.get(i) +" USD");
                    quantity  = 1;
                }
            }
            else{
                System.out.println("Light Model: " + c.itemsInCart.get(i) + " " +"Quantity: " + quantity + " " + "Price: " + quantity* c.itemPriceInCart.get(i) +" USD");
                quantity  = 1;
            }
        }
        int totalprice = c.itemPriceInCart.stream().mapToInt(Integer::intValue).sum();
//        for (int i = 0; i<c.itemPriceInCart.size(); i++){
//            totalprice = totalprice + c.itemPriceInCart.get(i);
//        }
        System.out.println("-----------------------------");

        System.out.println("Number of items: " + c.itemPriceInCart.size() +  "\t\t " +"Total Price: " + totalprice + " USD");
    }

    public void editOrder(Cart c) {
        System.out.println("0) Exit");
        for (int i = 0; i < c.itemsInCart.size(); i++) {
            System.out.println((i + 1) + ") " + c.itemsInCart.get(i) + "\t\t" + c.itemPriceInCart.get(i) + " USD");
        }
        System.out.print("Which light do you want to remove? Enter Option: ");
        Scanner s3 = new Scanner(System.in);
        int inp = s3.nextInt();
        if (inp != 0) {
            c.itemsInCart.remove(inp - 1);
            c.itemPriceInCart.remove(inp - 1);
            int quantity = 1;
            for (int i = 0; i < c.itemsInCart.size(); i++) {
                if (i != c.itemsInCart.size() - 1) {
                    if (c.itemsInCart.get(i).equals(c.itemsInCart.get(i + 1))) {
                        quantity++;
                    } else {
                        System.out.println(quantity + " " + c.itemsInCart.get(i) + " " + quantity * c.itemPriceInCart.get(i));
                        quantity = 1;
                    }
                } else {
                    System.out.println(quantity + " " + c.itemsInCart.get(i) + " " + quantity * c.itemPriceInCart.get(i));
                    quantity = 1;
                }
            }
            System.out.println("Cart Updated");
        }
        else{
            System.out.println("Cart Updated");
        }
    }

}