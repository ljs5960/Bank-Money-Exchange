package com.nhnacademy.exchange;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ExchangeServiceTest {
    // SUT
    ExchangeService service;

    @BeforeEach
    void setUp() {
        service = new ExchangeService();
    }

    /*
    돈 더했을 때 일치하지 않는 경우
     */
    @Test
    void check_addAmount_equal() {
        Money money1 = new Won(1000.0);
        Money money2 = new Won(1000.0);

        money1.addAmount(money2);
        assertThat(money1.getAmount()).isEqualTo(2000.0);
    }

    @Test
    void check_subAmount_eqal(){
        Money money1 = new Won(1000.0);
//        Money money2 = new Won(500,)
    }



}