package assertions;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exception.DepositService;

public class AssertionsTest {
    DepositService depositService;

    @Before
    public void setUp() throws Exception {
        depositService = new DepositService();
    }

    @Test
    public void should_use_junit() throws Exception {
        depositService.setMinimumDepositAmount(5.00);

        depositService.deposit(6.00);

        assertEquals(depositService.currentDeposit(), 6.00, 0.00);
    }

    @Test
    public void should_use_hamcrest() throws Exception {
        depositService.setMinimumDepositAmount(5.00);

        depositService.deposit(5.00);

//        Assert.assertThat(depositService.currentDeposit(), xxx(5.00));
    }

    @Test
    public void should_use_assertJ() throws Exception {
        depositService.setMinimumDepositAmount(5.00);

        depositService.deposit(5.00);

//        Assertions.assertThat(depositService.currentDeposit()).xxx(5.00);
    }

}
