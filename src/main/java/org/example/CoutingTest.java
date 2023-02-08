package org.example;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CoutingTest {

    @Test
    public void testCounting() {
        int expected = 10;
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        assertEquals(expected, count-1);
        System.out.println("Teste finalizado!");
    }
}
