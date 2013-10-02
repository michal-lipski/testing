package exception;

public class DepositService {


    private double minimumDepositAmount;
    private double depositAmount;

    public void setMinimumDepositAmount(double minimumDepositAmount) {

        this.minimumDepositAmount = minimumDepositAmount;
    }

    public void deposit(double depositAmount) throws InvalidDepositAmountException {
        if (depositAmount < minimumDepositAmount) {
//            throw new InvalidDepositAmountException(depositAmount);
        }
        this.depositAmount = depositAmount;
    }

    public double currentDeposit() {
        return depositAmount;
    }


    public class InvalidDepositAmountException extends Exception {
        private Double attemptedAmount;

        public InvalidDepositAmountException(double attemptedAmount) {
            this.attemptedAmount = attemptedAmount;
        }

        public Double getAttemptedAmount() {
            return attemptedAmount;
        }
    }
}
