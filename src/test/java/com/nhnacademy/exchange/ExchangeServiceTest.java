package com.nhnacademy.exchange;

import com.nhnacademy.exchange.exception.NegativeAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


import static org.assertj.core.api.Assertions.*;

class ExchangeServiceTest {
    // SUT
    ExchangeService service;

    @BeforeEach
    void setUp() {
        service = new ExchangeService();
        Money money = mock(Money.class);
    }

    /*
    돈 더했을 때 일치하는 경우
     */
    @Test
    void check_addAmount_equal() {
        Money money1 = new Won(1000.0);
        Money money2 = new Won(1000.0);

        money1.addAmount(money2);
        assertThat(money1.getAmount()).isEqualTo(2000.0);
    }

    /*
    돈을 뺐을 때 일치하는 경우
     */
    @Test
    void check_subAmount_equal() {
        Money money1 = new Won(1000.0);
        Money money2 = new Won(500.0);

        money1.subAmount(money2);
        assertThat(money1.getAmount()).isEqualTo(500);
    }

    /*
    돈을 뺐을 때 음수가 발생하는 경우 예외 발생
     */
    @Test
    void check_subAmount_ifNegative_thenThrowNegativeAmountException() {
        Money money1 = new Won(1000.0);




//        assertThatThrownBy(() -> money1.subAmount(money2))
//            .isInstanceOf(NegativeAmountException.class)
//                .hasMessageContainingAll("Amount is Negative Number: ", Double.toString(money1.getAmount()));
    }
//
//    @Test
//    void check_Equal_
}