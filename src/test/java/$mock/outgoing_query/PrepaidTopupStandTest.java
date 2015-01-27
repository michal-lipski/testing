package $mock.outgoing_query;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class PrepaidTopupStandTest {

    @Test
    public void sends_request_with_selection() {
        OrderHandler orderHandler = mock(OrderHandler.class);
        PrepaidTopup prepaidTopup = new PrepaidTopupStand(orderHandler);

        prepaidTopup.press(5);
        prepaidTopup.press(0);
        prepaidTopup.sendRequest();

        verify(orderHandler).placeOrder("50");
    }

    @Test
    public void order_is_placed_after_request_with_selection() {
        OrderHandler orderHandler = mock(OrderHandler.class);
        PrepaidTopup prepaidTopup = new PrepaidTopupStand(orderHandler);

        prepaidTopup.press(5);
        prepaidTopup.press(0);
        prepaidTopup.sendRequest();

        assertThat(orderHandler.getOrders()).contains("50");
    }

}