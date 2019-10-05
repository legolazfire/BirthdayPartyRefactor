package scrap.heap.refactor.factory;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import scrap.heap.refactor.model.CakeOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CakeFactoryTest {

    CakeFactory FACTORY = CakeFactory.INSTANCE;
    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().muteForSuccessfulTests().enableLog();

    @Test
    public void testOrder() {
        CakeOrder order = new CakeOrder("chocolate", "chocolate", "circle", "large", "brown");
        assertTrue(FACTORY.order(order));
        assertEquals("cake ordered; chocolate, chocolate, circle, large, brown\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testfrostingFlavor() {
        CakeOrder order = new CakeOrder("", "chocolate", "circle", "large", "brown");
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid frosting flavor\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidFlavor() {
        CakeOrder order = new CakeOrder("chocolate", "", "circle", "large", "brown");
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid flavor\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidShape() {
        CakeOrder order = new CakeOrder("chocolate", "chocolate", "", "large", "brown");
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid shape\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidSize() {
        CakeOrder order = new CakeOrder("chocolate", "chocolate", "circle", "", "brown");
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid size\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

    @Test
    public void testInvalidColor() {
        CakeOrder order = new CakeOrder("chocolate", "chocolate", "circle", "large", "");
        assertFalse(FACTORY.validateOrder(order));
        assertEquals("Invalid color\n", systemOutRule.getLogWithNormalizedLineSeparator());
    }

}
