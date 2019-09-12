package basicjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestOddEven {
    @Test
    public void testOddEven() {
        assertFalse(OddEven.isOdd(2));
        assertTrue(OddEven.isOdd(3));
    }
}
