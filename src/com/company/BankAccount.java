package com.company;

public class BankAccount {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(int sum) {
        amount = getAmount() + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("You are requesting for sum [" + sum + "] which is more then it was " +
                    "\nbut you withdrawn everything: ", +getAmount());
        } else if (amount <= 0) {
            amount = 0;
            throw new LimitException("There is no more money in your account ", +getAmount());
        } else {
            amount = getAmount() - sum;
        }
    }

}
