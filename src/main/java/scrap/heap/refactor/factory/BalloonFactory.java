package scrap.heap.refactor.factory;

import scrap.heap.refactor.model.BalloonOrder;

public class BalloonFactory implements OrderFactory<BalloonOrder> {

    // public INSTANCE member to get the singleton instance
    public static BalloonFactory INSTANCE = new BalloonFactory();

    private BalloonFactory() {
    }

    @Override
    public boolean validateOrder(BalloonOrder order) {
        //for the purposes of this exercise, pretend this method works and adds balloons to the model
        if (null == order.getColor() || order.getColor().isEmpty()) {
            System.out.println("Invalid color");
            return false;
        }

        if (null == order.getMaterial() || order.getMaterial().isEmpty()) {
            System.out.println("Invalid material");
            return false;
        }

        if (order.getNumber() <= 0) {
            System.out.println("Invalid count");
            return false;
        }

        return true;
    }

    @Override
    public boolean order(BalloonOrder order) {
        System.out.println("Balloons ordered; " + order.getColor() + ", " + order.getMaterial() + ", " + order.getNumber());
        return true;
    }
}
