package com.nhnacademy.exchange;

public class Money {
    private double amount;

    public Money(){
        this.amount = 0.0;
    }

    public double getAmount(){
        return this.amount;
    }

    public void addAmount(Money money){
        this.amount += money.getAmount();
    }

    public void subAmount(Money money){
        this.amount -= money.getAmount();
    }
}
