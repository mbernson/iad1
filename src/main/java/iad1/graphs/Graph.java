package iad1.graphs;

import java.io.*;
import java.util.ArrayList;

public class Graph {
    private final int vertices;
    private int edges;
    private ArrayList<Integer>[] adjacency;

    public Graph(int v) {
        vertices = v;
        edges = 0;
        adjacency = (ArrayList<Integer>[]) new ArrayList[v];
        for (int i = 0; i < vertices; i++) {
            adjacency[i] = new ArrayList<Integer>();
        }
    }

    public Graph(BufferedReader in) throws IOException {
        new DataInputStream(new Reader)
        this(in.readInt());
        int edges = in.readInt();
        for (int i = 0; i < edges; i++) {
            addEdge(in.readInt(), in.readInt());
        }
    }

    public Graph(final String path) throws IOException {
        this(new BufferedReader(new InputStreamReader(new FileInputStream(path))));
    }

    public int verticesCount() {
        return vertices;
    }

    public int edgesCount() {
        return edges;
    }

    public void addEdge(int v, int w) {
        adjacency[v].add(w);
        adjacency[w].add(v);
    }

    public Iterable<Integer> adjacentToVertex(int v) {
        return adjacency[v];
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
