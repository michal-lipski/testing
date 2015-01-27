package $mock.outgoing_query;

public class PrepaidTopupStand implements PrepaidTopup {

    private final OrderHandler orderHandler;

    public PrepaidTopupStand(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    private String selection = "";

    @Override
    public void press(Integer number) {
        selection += "" + number;
    }

    @Override
    public void sendRequest() {
        orderHandler.placeOrder(selection);
    }

}
