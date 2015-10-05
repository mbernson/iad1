package iad1.graphs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class GraphTest {
    private Graph graph;

    @Before
    public void setUp() throws Exception {
        String path = getClass().getResource("/graph.txt").getPath();
        System.out.println(path);
        graph = new Graph(path);
    }

    @Test
    public void testToString() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        graph = null;
    }
}