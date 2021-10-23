import holidayLightsPortal.Cart;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class CartTest {

    @Test
    public void testAddItem() {
        Cart cart = new Cart();
        cart.addItem("c7",100,3);
        assertEquals(1,cart.itemsInCart.size());
        assertEquals("c7",cart.itemsInCart.get(0));
        assertEquals(1,cart.itemPriceInCart.size());
        assertEquals("100",cart.itemPriceInCart.get(0).toString());
        assertEquals(1,cart.itemQuantity.size());
        assertEquals("3",cart.itemQuantity.get(0).toString());

    }

    @Test
    public void testCartState(){
        Cart cart = new Cart();
        assertEquals("EmptyCart",cart.state);
        cart.addItem("c9",220,1);
        assertEquals("Ready to Order",cart.state);

    }

}