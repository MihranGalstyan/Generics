import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Basket<F extends Fruit> {
    private List<F> fruitsBasket;
    private double basketWeight = 0;
    private int size = 0;

    public Basket() {
        fruitsBasket = new ArrayList<>();
    }

    public double getWeight() {
        return basketWeight;
    }

    public int getSize() {
        return size;
    }

    public boolean add(F fruit) {
        fruitsBasket.add(fruit);
        basketWeight += fruit.getWeight();
        size++;
        return true;
    }

    public int compare(Basket<? extends Fruit> secondBasket) {
        return Double.compare(this.basketWeight, secondBasket.basketWeight);
    }

    public<U extends Fruit> void transfer(Basket<? super F> dst) {
        for (final F fruit : fruitsBasket) {
            dst.add(fruit);
        }
        fruitsBasket.clear();
        basketWeight = 0;
    }

    public <U extends Fruit> void transferTo(Basket<U> basket, Basket<? super U> dst){
        dst.fruitsBasket.addAll(basket.fruitsBasket);
        basket.fruitsBasket.clear();
    }
}
