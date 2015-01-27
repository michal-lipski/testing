package $mock.incomingCommand;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class PrepaidTopupStandTest {

    @Test
    public void imputing_numbers() {
        PrepaidTopup prepaidTopup = new PrepaidTopupStand(new OrderHandler());
        prepaidTopup.press(5);
        prepaidTopup.press(0);

        String selection = prepaidTopup.getSelection();

        assertThat(selection).isEqualTo("50");
    }

}