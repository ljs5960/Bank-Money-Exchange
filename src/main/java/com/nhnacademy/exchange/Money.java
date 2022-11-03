package com.nhnacademy.exchange;

import com.nhnacademy.exchange.exception.NoMatchCurrencyException;
import java.util.Objects;

public class Money {
    private double amount;
    private String currency = "";

    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void addAmount(Money money) {
        if (!Objects.equals(this.currency, money.getCurrency())) {
            throw new NoMatchCurrencyException(this.currency, money.getCurrency());
        }

        this.amount += money.getAmount();
    }

    public void subAmount(Money money) {
        this.amount -= money.getAmount();
    }
}
