package com.nhnacademy.exchange;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void addMoney_notEqual_thenThrowException() {
//        Money money1 = new Won();
//        Money money2 = new Won();
//        money1.getAmount()
    }

}