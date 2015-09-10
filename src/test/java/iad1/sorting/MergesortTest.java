package iad1.sorting;

import org.junit.Before;

public class MergesortTest extends SortableTestCase {
    @Before
    public void setUp() throws Exception {
        sorter = new Mergesort<>();
    }
}