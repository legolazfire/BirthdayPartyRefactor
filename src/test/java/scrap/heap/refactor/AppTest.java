/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package scrap.heap.refactor;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().muteForSuccessfulTests().enableLog();

    @Test
    public void testAppOrder() {
        App classUnderTest = new App();

        classUnderTest.placeOrders();

        String expected = "Balloons ordered; red, mylar, 4\n" +
              "cake ordered; chocolate, chocolate, circle, large, brown\n" +
              "Balloons ordered; blue, latex, 7\n" +
              "cake ordered; chocelate, Vanilla, square, med, brown\n" +
              "Balloons ordered; yellow, mylar, 4\n" +
              "cake ordered; vanilla, vanilla, square, small, yellow\n";
        assertEquals(expected, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
