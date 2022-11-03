package com.nhnacademy.exchange;

public class Won implements Money {
    private Double amount = 0.0;
    private String currency = "krw";

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Won(Double amount ) {
        this.amount = amount;
    }

    @Override
    public Double add(Money money1, Money money2) {
        return null;
    }
}
