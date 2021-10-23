package holidayLightsPortal;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class CartActions {

    public void editOrder(Cart c) {
        System.out.println("0) Exit");
        for (int i = 0; i < c.itemsInCart.size(); i++) {
            System.out.println((i + 1) + ") " + c.itemsInCart.get(i) + "\t\t" + c.itemPriceInCart.get(i) + " USD" + "\t\t" + c.itemQuantity.get(i));
        }
        System.out.print("Which light do you want to remove? Enter Option: ");
        Scanner s3 = new Scanner(System.in);
        int inp = s3.nextInt();
        if (inp != 0) {
            System.out.print("Enter Quantity ");
            int quan = s3.nextInt();
            int origQuan = c.itemQuantity.get(inp - 1);
            if (origQuan < quan) System.out.print("Entered Quantity is not correct. No changes made to cart");
            else {
                int newQuan = origQuan - quan;
                c.itemQuantity.set(inp - 1, newQuan);
                int quantity = 1;
                System.out.println("Cart Updated");
                for (int i = 0; i < c.itemsInCart.size(); i++) {
                    System.out.println((i + 1) + ") " + c.itemsInCart.get(i) + "\t\t" + c.itemPriceInCart.get(i) + " USD" + "\t\t" + c.itemQuantity.get(i));
                }
            }
        } else {
            System.out.println("No changes made to the cart");
        }
        if (c.itemsInCart.isEmpty()) {
            c.state = new EmptyCart().updateState();
        }
    }
    public void orderSummary(Cart c) {

        while (c.hasNext()) {
            System.out.println("Light Model: " + c.itemsInCart.get(c.index) + "\t\t " + "Quantity: " + c.itemQuantity.get(c.index) + "\t\t" + "Price per Unit: " + c.itemPriceInCart.get(c.index) + " USD");
            c.index++;}
            int totalprice = 0;
            ListIterator<Integer> theIterator = c.itemPriceInCart.listIterator();
            while (theIterator.hasNext()) {
                int index = theIterator.nextIndex();
                totalprice = totalprice + (theIterator.next()* c.itemQuantity.get(index));
//                totalprice = totalprice + (theIterator.next()*c.;
            }
            System.out.println("-----------------------------");
            System.out.println("Number of items: " + c.itemPriceInCart.size() + "\t\t " + "Total Price: " + totalprice + " USD");
        }

    }