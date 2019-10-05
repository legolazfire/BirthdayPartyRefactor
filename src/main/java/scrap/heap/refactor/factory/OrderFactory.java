package scrap.heap.refactor.factory;

public interface OrderFactory<T> {
    /**
     * Validate the given order
     *
     * @param order
     * @return
     */
    boolean validateOrder(T order);

    /**
     * Place the order
     *
     * @param order
     * @return
     */
    boolean order(T order);
}
