package iad1.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuicksortTest {
    private Quicksort<Integer> sorter;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testSortingIntegerArrays() throws Exception {
        Integer[] items =  { 3, 4, 2, 1, 5 },
                  sorted = { 1, 2, 3, 4, 5 };

        sorter = new Quicksort<>(items);

        assertArrayEquals(sorted, sorter.sort());
    }

    @After
    public void tearDown() throws Exception {
        assertTrue(true);
    }
}
