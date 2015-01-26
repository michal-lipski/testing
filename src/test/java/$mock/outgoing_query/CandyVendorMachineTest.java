package $mock.outgoing_query;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class CandyVendorMachineTest {

    @Test
    public void sends_request_with_selection() {
        OrderHandler orderHandler = mock(OrderHandler.class);
        VendorMachine vendorMachine = new CandyVendorMachine(orderHandler);

        vendorMachine.press(2);
        vendorMachine.press(3);
        vendorMachine.sendRequest();

        verify(orderHandler).placeOrder("23");
    }

    @Test
    public void order_is_placed_after_request_with_selection() {
        OrderHandler orderHandler = mock(OrderHandler.class);
        VendorMachine vendorMachine = new CandyVendorMachine(orderHandler);

        vendorMachine.press(2);
        vendorMachine.press(3);
        vendorMachine.sendRequest();

        assertThat(orderHandler.getOrders()).contains("23");
    }

}