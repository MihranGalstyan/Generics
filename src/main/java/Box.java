/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Box<S, F, I> {
    private S firstType;
    private F secondType;
    private I thirdType;

    public S getFirstType() {
        return firstType;
    }

    public void setFirstType(final S firstType) {
        this.firstType = firstType;
    }

    public F getSecondType() {
        return secondType;
    }

    public void setSecondType(final F secondType) {
        this.secondType = secondType;
    }

    public I getThirdType() {
        return thirdType;
    }

    public void setThirdType(final I thirdType) {
        this.thirdType = thirdType;
    }

    public Box(final S sType, final F secondType, final I thirdType) {
        this.firstType = sType;
        this.secondType = secondType;
        this.thirdType = thirdType;
    }
}
