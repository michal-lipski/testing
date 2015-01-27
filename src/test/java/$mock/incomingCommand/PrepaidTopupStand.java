package $mock.incomingCommand;


public class PrepaidTopupStand implements PrepaidTopup {

    private final OrderHandler orderHandler;

    private String selection = "";

    public PrepaidTopupStand(OrderHandler orderHandler) {
        this.orderHandler = orderHandler;
    }

    @Override
    public void press(Integer number) {
        selection += "" + number;
    }

    @Override
    public void sendRequest() {
        orderHandler.placeOrder(selection);
    }

    @Override
    public String getSelection() {
        return selection;
    }
}
