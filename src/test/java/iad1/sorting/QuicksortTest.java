package iad1.sorting;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuicksortTest extends SortableTestCase {

    @Override
    @Before
    public void setUp() throws Exception {
        sorter = new Quicksort<>();
    }

}
