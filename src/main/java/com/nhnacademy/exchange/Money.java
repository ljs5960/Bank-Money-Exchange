package com.nhnacademy.exchange;

import com.nhnacademy.exchange.exception.IncorrectCurrencyException;
import com.nhnacademy.exchange.exception.NegativeAmountException;
import com.nhnacademy.exchange.exception.NoMatchCurrencyException;
import java.util.Objects;

public class Money {
    private double amount;
    private final String currency;

    public Money(double amount, String currency) {
        this.amount = amount;
//        if(Currency.values()){
//            throw new IncorrectCurrencyException(currency);
//        }
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
        if (!Objects.equals(this.currency, money.getCurrency())) {
            throw new NoMatchCurrencyException(this.currency, money.getCurrency());
        }
        if(this.amount - money.getAmount() < 0){
            throw new NegativeAmountException(this.amount-money.getAmount());
        }
        this.amount -= money.getAmount();
    }
}
