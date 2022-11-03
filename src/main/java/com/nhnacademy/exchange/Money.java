package com.nhnacademy.exchange;

public interface Money {

    double getAmount();

    void addAmount(Money money);

    void subAmount(Money money);
}
