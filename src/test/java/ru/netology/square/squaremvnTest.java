package ru.netology.square;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class squaremvnTest {

    @Test
    public void resultTestFirst() {
        squaremvn service = new squaremvn();

        int actual = service.calc(0, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void resultTestSecond() {
        squaremvn service = new squaremvn();

        int actual = service.calc(-1, 100);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void resultTestThird() {
        squaremvn service = new squaremvn();

        int actual = service.calc(0, 101);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void resultTestFourth() {
        squaremvn service = new squaremvn();

        int actual = service.calc(-1, 101);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
}
