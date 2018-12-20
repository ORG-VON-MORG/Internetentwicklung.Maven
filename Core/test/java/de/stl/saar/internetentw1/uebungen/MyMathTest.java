package de.stl.saar.internetentw1.uebungen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @Test
    void testAdd() {
        MyMath myMath = new MyMath();
        final int EXPECTED_RESULT = 7;
        int testResult = myMath.add(2,5);

        assertEquals(EXPECTED_RESULT,testResult);
    }

}