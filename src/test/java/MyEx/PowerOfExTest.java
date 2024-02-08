package MyEx;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PowerOfExTest {


    /**
     * Should return true when b is a power of a
     */
    @Test
    public void mainWhenBIsPowerOfA() {
        int a = 2;
        int b = 8;
        boolean expected = true;

        boolean result = PowerOfEx.isPowerOf(a, b);

        assertTrue(result);
    }

    /**
     * Should return true when b is 1 regardless of a
     */
    @Test
    public void isPowerOfWhenBIsOne() {
        int a = 2;
        int b = 1;
        boolean result = PowerOfEx.isPowerOf(a, b);
        assertTrue(result);
    }

    /**
     * Should return false when b is not a power of a
     */
    @Test
    public void isPowerOfWhenBIsNotPowerOfA() {
        int a = 2;
        int b = 10;
        boolean result = PowerOfEx.isPowerOf(a, b);
        assertFalse(result);
    }
}