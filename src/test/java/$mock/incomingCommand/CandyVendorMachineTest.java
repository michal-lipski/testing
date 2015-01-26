package $mock.incomingCommand;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class CandyVendorMachineTest {

    @Test
    public void imputing_numbers() {
        VendorMachine vendorMachine = new CandyVendorMachine(new OrderHandler());
        vendorMachine.press(2);
        vendorMachine.press(3);

        String selection = vendorMachine.getSelection();

        assertThat(selection).isEqualTo("23");
    }

}