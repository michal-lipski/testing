package $mock.incomingCommand;


public class CandyVendorMachine implements VendorMachine {

    private final OrderHandler orderHandler;

    private String selection = "";

    public CandyVendorMachine(OrderHandler orderHandler) {
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
