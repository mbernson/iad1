package iad1.graphs;

public interface Graph<V> {
    int vertices();
    int edges();

    void addEdge(int v, int w);

    Iterable<Integer> adj(int v);

    String toString();
}
