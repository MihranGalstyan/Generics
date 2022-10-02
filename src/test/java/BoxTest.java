import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
class BoxTest {

    @Test
    void testBox() {
        Box<Integer> box1 = new Box<>(5, 10, 15);
        Box<Integer> box2 = new Box<>(20, 25, 45);
        double result = box1.avg() + box2.avg();
        assertEquals(40.0, result, 0.001);
    }
}