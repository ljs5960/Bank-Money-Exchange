package com.nhnacademy.exchange;

public class ExchangeService {

    private final int EXCHANGE_RATE = 1000;

    public void exchange(Money money1) {
        if(money1.getCurrency().equals("dollar")){
            money1.setCurrency("won");
            this.check_RoundAmcount(money1);
            money1.setAmount(money1.getAmount() * EXCHANGE_RATE);
        }else if(money1.getCurrency().equals("won")){
            money1.setCurrency("dollar");
            money1.setAmount(money1.getAmount() / EXCHANGE_RATE);
        }
    }

    private void check_RoundAmcount(Money money1) {
        money1.setAmount(Math.round(money1.getAmount()));
    }
}
