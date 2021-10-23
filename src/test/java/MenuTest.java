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
        Menu.cart.state = new ReadyToOrder().updateState();
        assertEquals(6,menu.displayMenu());
    }

    @Test
    public void testOrderSelection() {
        Menu menu = new Menu();
        assertFalse(Menu.orderSelection("8"));
        assertTrue(Menu.orderSelection("5"));
        Boolean flag = Menu.orderSelection("5");
        assertEquals("Ordered", Menu.cart.state);

    }
}