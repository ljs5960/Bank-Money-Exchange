package com.nhnacademy.exchange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExchangeServiceTest {

    ExchangeService exchangeService;

    @BeforeEach
    void setUp() {
        exchangeService = new ExchangeService();
    }

    @Test
    void check_ExchangeRate_validate(){
        Money money1 = new Money(1000.0, "won");

        exchangeService.exchange(money1);
        assertThat(money1.getAmount()).isEqualTo(1);
        assertThat(money1.getCurrency()).isEqualTo("dollar");

        exchangeService.exchange(money1);
        assertThat(money1.getAmount()).isEqualTo(1000);
        assertThat(money1.getCurrency()).isEqualTo("won");

    }

    @Test
    void check_Exchange_DecimalPoint(){
        Money money1 = new Money(0.006, "dollar");

        exchangeService.exchange(money1);
        assertThat(money1.getAmount()).isEqualTo(10);
        assertThat(money1.getCurrency()).isEqualTo("won");
    }



}