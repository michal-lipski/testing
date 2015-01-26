package $mock.outgoing_query;

public class OrderExecutor implements OrderHandler {

    @Override
    public Void placeOrder(String number) {
        return null;
    }

    @Override
    public String getOrders() {
        return null;
    }
}
