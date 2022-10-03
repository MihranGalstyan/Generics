import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
class BoxTest {

    @Test
    void testBox() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        List<Integer> dst = new ArrayList<>();
        Box.transfer(numbers,dst);
        assertEquals(0, numbers.size());
        assertEquals(10,dst.size());
        assertEquals(8,dst.get(8));
    }
}