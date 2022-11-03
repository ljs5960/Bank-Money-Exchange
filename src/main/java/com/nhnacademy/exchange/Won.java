package com.nhnacademy.exchange;

public class Won implements Money {
    private double amount = 0.0;
    private String currency = "krw";

    public double getAmount() {
        return amount;
    }

    @Override
    public void addAmount(Money money) {
        this.amount += money.getAmount();
    }

    @Override
    public void subAmount(Money money) {
        this.amount -= money.getAmount();
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Won(Double amount ) {
        this.amount = amount;
    }

}
