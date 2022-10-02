import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
class BoxTest {

    @Test
    void testBox() {
        Box<String, Float, Integer> box1 = new Box<>("Text1", 10.4f, 5);
        Box<String, Float, Integer> box2 = new Box<>("Text2", 20.3f, 4);
        double result = box1.getSecondType() + box1.getThirdType() + box2.getSecondType() + box2.getThirdType();
        assertEquals(39.7, result, 0.01);
    }
}