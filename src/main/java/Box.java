import java.util.List;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Box<T extends Number> {
    private T[] array;

    public Box(final T... array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(final T[] array) {
        this.array = array;
    }

    public double avg() {
        double result = 0;
        for (final T number : array) {
            result += ((Number) number).doubleValue();
        }
        return result / array.length;
    }

    public int compare(Box<?> box) {
        if (this.avg() > box.avg()) {
            return 1;
        } else if (this.avg() > box.avg()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void someMethod(List<? extends Number> numbers) {

    }
}
