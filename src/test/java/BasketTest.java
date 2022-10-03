import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
class BasketTest {
    @Test
    void basketTest() {
        Basket<Apple> apples = new Basket<>();
        Basket<Orange> oranges = new Basket<>();

        for (int i = 0; i < 10; i++) {
            apples.add(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
        }

        Basket<Fruit> fruits = new Basket<>();
        assertEquals(-1, apples.compare(oranges));
        apples.transfer(fruits);
        assertEquals(0, apples.getWeight(), 0.001);

        assertEquals(10, fruits.getWeight(), 0.001);
        oranges.transfer(fruits);
        assertEquals(0, oranges.getWeight(), 0.001);

        assertEquals(25, fruits.getWeight(), 0.001);
        assertTrue(fruits.add(new Apple()));
        assertTrue(fruits.add(new Orange()));
    }
}