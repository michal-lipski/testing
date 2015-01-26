package $mock.outgoing_query;

public class CandyVendorMachine implements VendorMachine {

    private final OrderHandler orderHandler;

    public CandyVendorMachine(OrderHandler orderHandler) {
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
