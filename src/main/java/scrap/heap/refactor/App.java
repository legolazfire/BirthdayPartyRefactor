package scrap.heap.refactor;

import scrap.heap.refactor.factory.BalloonFactory;
import scrap.heap.refactor.factory.CakeFactory;
import scrap.heap.refactor.model.BalloonOrder;
import scrap.heap.refactor.model.CakeOrder;

public class App {

    public String getGreeting() {
        return "Hello world.";
    }

    //Create factories to place orders
    private final BalloonFactory BALLOON_FACTORY = BalloonFactory.INSTANCE;
    private final CakeFactory CAKE_FACTORY = CakeFactory.INSTANCE;

    public void placeOrders() {


        // order 1
        placeBalloonOrder(new BalloonOrder("red", "mylar", 4));
        placeCakeOrder(new CakeOrder("chocolate", "chocolate", "circle", "large", "brown"));

        // order 2
        placeBalloonOrder(new BalloonOrder("blue", "latex", 7));
        placeCakeOrder(new CakeOrder("Vanilla", "chocelate", "square", "med", "brown"));

        // order 3
        placeBalloonOrder(new BalloonOrder("yellow", "mylar", 4));
        placeCakeOrder(new CakeOrder("vanilla", "vanilla", "square", "small", "yellow"));

    }

    private void placeCakeOrder(CakeOrder cakeOrder) {
        if (CAKE_FACTORY.validateOrder(cakeOrder)) {
            CAKE_FACTORY.order(cakeOrder);
        }
    }

    private void placeBalloonOrder(BalloonOrder balloonOrder) {
        if (BALLOON_FACTORY.validateOrder(balloonOrder)) {
            BALLOON_FACTORY.order(balloonOrder);
        }
    }

    public static void main(String[] args) {
        App party = new App();
        party.placeOrders();

    }
}
