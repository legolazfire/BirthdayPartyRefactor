package scrap.heap.refactor.model;

/**
 * Model for cake order
 */
public class CakeOrder {

    /**
     * color of the cake
     */
    private final String color;

    /**
     * Flavor of the cake
     */
    private final String flavor;

    /**
     * Shape of the cake
     */
    private final String shape;

    /**
     * Frosting flavor of the cake
     */
    private final String frostingFlavor;
    /**
     * Size of the cake
     */
    private final String size;

    public CakeOrder(String frostingFlavor, String flavor, String shape, String size, String color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getShape() {
        return shape;
    }

    public String getFrostingFlavor() {
        return frostingFlavor;
    }

    public String getSize() {
        return size;
    }


}
