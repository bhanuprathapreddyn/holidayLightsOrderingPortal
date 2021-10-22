import holidayLightsPortal.Cart;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CartTest {

    @Test
    public void testAddItem() {
        Cart cart = new Cart();
        cart.addItem("c7",100,3);
        assertEquals(3,cart.itemsInCart.size());
        assertEquals("c7",cart.itemsInCart.get(0));
        assertEquals(3,cart.itemPriceInCart.size());
        assertEquals("100",cart.itemPriceInCart.get(0).toString());
    }

    @Test
    public void testCartState(){
        Cart cart = new Cart();
        assertEquals("EmptyCart",cart.state);
        cart.addItem("c9",220,1);
        assertEquals("Ready to Order",cart.state);

    }

}