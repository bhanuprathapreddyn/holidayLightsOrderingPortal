import holidayLightsPortal.Menu;
import holidayLightsPortal.ReadyToOrder;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class MenuTest {

    @Test
    public void testDisplayMenu() {
        Menu menu = new Menu();
        assertEquals(4,menu.displayMenu());
        menu.cart.state = String.valueOf(new ReadyToOrder());;
        assertEquals(6,menu.displayMenu());

    }

    @Test
    public void testOrderSelection() {
        Menu menu = new Menu();
        assertFalse(menu.orderSelection("8"));
        assertTrue(menu.orderSelection("5"));
    }
}