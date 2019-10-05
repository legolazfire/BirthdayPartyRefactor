package scrap.heap.refactor.model;

/**
 * Model for Balloon order
 */
public class BalloonOrder {

    /**
     * color of the balloon
     */
    private final String color;
    /**
     * Material of balloon
     */
    private final String material;

    /**
     * Number of balloons to order
     */
    private final int number;

    public BalloonOrder(String color, String material, int number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getNumber() {
        return number;
    }

}
