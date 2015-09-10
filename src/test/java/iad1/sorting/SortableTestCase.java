package iad1.sorting;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public abstract class SortableTestCase {
    protected Sorter sorter;

    public abstract void setUp() throws Exception;

    @Test
    public void testSortingIntegerArrays() {
        Integer[] items =  { 3, 4, 2, 1, 5 },
                  sorted = { 1, 2, 3, 4, 5 };

        assertArrayEquals(sorted, sorter.sort(items));
    }

    @Test
    public void testSortingCharacterArrays() {
        String[] items = {
                "Foo",
                "Baz",
                "Bar",
                "Shibboleth",
                "Quux",
        },
        sorted = {
                "Bar",
                "Baz",
                "Foo",
                "Quux",
                "Shibboleth",
        };

        assertArrayEquals(sorted, sorter.sort(items));
    }

    @After
    public void tearDown() {
        sorter = null;
    }
}
