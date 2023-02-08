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

    @Test
    public void testCounting2() {
        int expected = 5;
        int count = 1;
        while (count <= 5) {
            System.out.println(count);
            count++;
        }
        assertEquals(expected, count-1);
        System.out.println("Teste finalizado2!");
    }

    @Test
    public void testCounting3() {
        int expected = 15;
        int count = 1;
        while (count <= 15) {
            System.out.println(count);
            count++;
        }
        assertEquals(expected, count-1);
        System.out.println("Teste finalizado3!");
    }

}
