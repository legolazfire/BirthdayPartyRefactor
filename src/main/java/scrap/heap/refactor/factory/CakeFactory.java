package scrap.heap.refactor.factory;

import scrap.heap.refactor.model.CakeOrder;

public class CakeFactory implements OrderFactory<CakeOrder> {

    // public INSTANCE member to get the singleton instance
    public static CakeFactory INSTANCE = new CakeFactory();

    private CakeFactory() {
    }

    @Override
    public boolean validateOrder(CakeOrder order) {
        if (null == order.getColor() || order.getColor().isEmpty()) {
            System.out.println("Invalid color");
            return false;
        }

        if (null == order.getFlavor() || order.getFlavor().isEmpty()) {
            System.out.println("Invalid flavor");
            return false;
        }

        if (null == order.getFrostingFlavor() || order.getFrostingFlavor().isEmpty()) {
            System.out.println("Invalid frosting flavor");
            return false;
        }

        if (null == order.getShape() || order.getShape().isEmpty()) {
            System.out.println("Invalid shape");
            return false;
        }
        if (null == order.getSize() || order.getSize().isEmpty()) {
            System.out.println("Invalid size");
            return false;
        }

        return true;
    }

    @Override
    public boolean order(CakeOrder order) {
        //for the purposes of this exercise, pretend that this method adds a cake to the model
        System.out.println("cake ordered; " + order.getFlavor() + ", " + order.getFrostingFlavor() + ", " + order.getShape() + ", " + order.getSize() + ", " + order.getColor());
        return true;
    }
}
