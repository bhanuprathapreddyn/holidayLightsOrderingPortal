import holidayLightsPortal.Menu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class MenuTest {
    Menu menu = new Menu();
    private StandardInputStream in = new StandardInputStream();
    private StandardOutputStream out = new StandardOutputStream();

    @Before
    public void before() {
        System.setIn(in);
        System.setOut(out);
    }
    @After
    public void after() {
        System.setIn(null);
        System.setOut(null);
    }
    //@StdIo({"Hello", "World"})
    @Test
    public void displayMenu() {
        in.inputln("1");
        in.inputln("1");
        in.inputln("1");
        menu.orderSelection("1");
        System.out.print("**** "+out.readLine());
        assertEquals(4,menu.orderSelection("1"));
    }

    @Test
    public void orderSelection() {
    }
}