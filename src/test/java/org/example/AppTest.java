package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
// int[] FibbSeq = {0, 1, 1, 2, 3, 5}
public class AppTest {
    @Test
    @DisplayName("check entering 0 returns 0")
    void checkZeroTest() {
        Assertions.assertEquals(0, App.FibbSeqNumber(0));
    }

    @Test
    @DisplayName("check entering 1 returns 1")
    void checkOneTest() {
        Assertions.assertEquals(1, App.FibbSeqNumber(1));
    }

    @Test
    @DisplayName("check entering 2 returns 1")
    void checkTwoTest() {
        Assertions.assertEquals(1, App.FibbSeqNumber(2));
    }

    @Test
    @DisplayName("check entering 3 returns 2")
    void checkThreeTest() {
        Assertions.assertEquals(2, App.FibbSeqNumber(3));
    }

    @Test
    @DisplayName("check entering 4 returns 3")
    void checkFourTest() {
        Assertions.assertEquals(3, App.FibbSeqNumber(4));
    }

    @Test
    @DisplayName("check entering 10 returns 55")
    void checkTenTest() {
        Assertions.assertEquals(55, App.FibbSeqNumber(10));
    }

    @Test
    @DisplayName("check entering -2 returns 0")
    void checkNegativeTest() {
        Assertions.assertEquals(0, App.FibbSeqNumber(-2));
    }

    @Test
    @DisplayName("check entering null returns 0")
    void checkNullTest() {
        Assertions.assertEquals(0, App.FibbSeqNumber(null));
    }
}