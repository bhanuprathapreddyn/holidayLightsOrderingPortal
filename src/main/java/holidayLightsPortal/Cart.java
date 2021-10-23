package holidayLightsPortal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart implements CartState, CartIterator {
    CartState cs;
    int index=0;
    public String state = new EmptyCart().updateState();
    public List<String> itemsInCart;
    public List<Integer> itemPriceInCart;
    public List<Integer> itemQuantity;

    public CartIterator getIterator() {
        return new Cart();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cs=" + cs +
                ", state='" + state + '\'' +
                ", itemnamecart=" + itemsInCart +
                ", itempricecart=" + itemPriceInCart +
                '}';
    }

    public Cart() {
        itemsInCart = new ArrayList<>();
        itemPriceInCart = new ArrayList<>();
        itemQuantity = new ArrayList<>();

    }

    public void addItem(String item, int price, int quantity) {
//        for (int i = 0; i < quantity; i++) {
        if(!itemsInCart.contains(item)) {
            itemsInCart.add(item);
            itemPriceInCart.add(price);
            itemQuantity.add(quantity);
        }else{
            int index = itemsInCart.indexOf(item);
            int origQuantity = itemQuantity.get(index);
            itemQuantity.set(index,quantity+origQuantity);
        }
        state = new ReadyToOrder().updateState();
    }

    @Override
    public String updateState() {
        return null;
    }

    //Singleton Class - Only one instance of cart is allowed
    public static Cart cartInstance;

    public static Cart getInstance() {
        cartInstance = new Cart();
        return cartInstance;

    }

    @Override
    public boolean hasNext() {
        return index < itemsInCart.size();
    }

    @Override
    public Object next() {
        String item;
        int price;
        int quantity;

        if (this.hasNext())
        {
            item =  itemsInCart.get(index);
            price = itemPriceInCart.get(index);
            quantity = itemQuantity.get(index);
            index++;
            return null;
            }
        return null;
    }
}
