package de.stl.saar.internetentw1.uebungen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void add() {
        int expectedResult = 15;
        MyMath myMath = new MyMath();
        int result = myMath.add(10,5);

        assertEquals(expectedResult, result);
    }
}