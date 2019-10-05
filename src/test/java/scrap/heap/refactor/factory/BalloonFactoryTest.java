package scrap.heap.refactor.factory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import scrap.heap.refactor.model.BalloonOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalloonFactoryTest {

    BalloonFactory FACTORY = BalloonFactory.INSTANCE;
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().muteForSuccessfulTests().enableLog();


    @Test
    public void testOrder() {
        BalloonOrder order = new BalloonOrder("red", "mylar", 4);
        assertTrue(FACTORY.order(order));
        assertEquals("Balloons ordered; red, mylar, 4\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidColor() {
        BalloonOrder order = new BalloonOrder("", "mylar", 4);
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid color\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidMaterial() {
        BalloonOrder order = new BalloonOrder("red", "", 4);
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid material\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidCount() {
        BalloonOrder order = new BalloonOrder("red", "latex", -1);
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid count\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

}
