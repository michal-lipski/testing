package exception;

import org.junit.Test;

public class ExceptionHandlingTest {
//bad
    @Test
    public void testDepositBelowMinimumAmount() throws InvalidDepositAmountException {
        double depositAmount = 4.99;
        depositService.setMinimumDepositAmount(5.00);
        try {
            depositService.deposit(depositAmount, A123_ID);
            fail("expected InvalidDepositAmountException");
        } catch (InvalidDepositAmountException error) {
            assertThat(error.getAttemptedAmount(), equalTo(depositAmount));
        }
        assertThat(accountRepository.findById(A123_ID).getBalance(), equalTo(A123_INITIAL_BAL));
    }


    //better ?
    @Test(expected = InvalidDepositAmountException.class)
    public void testDeposit() {
        double depositAmount = 100.00;
        depositService.setMinimumDepositAmount(5.00);

        depositService.deposit(depositAmount, A123_ID);

        //exception expected
    }


    //best
    //package com.googlecode.catchexception;
    @Test
    public void logout() {
        session.logout();

        catchException(session).logout();

        assertThat(caughtException()).isExactlyInstanceOf(MstrInvalidSessionException.class);
    }
}
