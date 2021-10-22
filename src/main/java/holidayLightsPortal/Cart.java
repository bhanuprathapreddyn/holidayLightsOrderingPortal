package holidayLightsPortal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cart implements CartState, CartIterator {
    CartState cs;
    int index;
    public String state = new EmptyCart().updateState();
    public List<String> itemsInCart;
    public List<Integer> itemPriceInCart;

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
    }

    public void addItem(String item, int price, int quantity) {
        for (int i = 0; i < quantity; i++) {
            itemsInCart.add(item);
            itemPriceInCart.add(price);
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
        if (this.hasNext()) return itemsInCart.get(index++);
        return null;
    }
}
