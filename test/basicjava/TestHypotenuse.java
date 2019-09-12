package basicjava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHypotenuse {
    @Test
    public void testHypotenuse() {
        assertEquals(5, Hypotenuse.calculateHypotenuse(3, 4));

        assertEquals(13, Hypotenuse.calculateHypotenuse(5, 12));
    }

    @Test
    public void testIrrationals() {
        assertEquals(Math.sqrt(2), Hypotenuse.calculateHypotenuse(1, 1), 0.0001);

        assertEquals(2, Hypotenuse.calculateHypotenuse(1, Math.sqrt(3)), 0.0001);
    }
}
