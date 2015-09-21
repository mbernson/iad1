package iiad.les6.graphs;

import java.util.ArrayList;

public class Graph {
    private ArrayList<GraphNode[]> nodes;

    public void link(GraphNode a, GraphNode b) {
        nodes.add(new GraphNode[] { a, b });
    }

    public class GraphNode<E> {

        private E value;

        public GraphNode() {
            this(null);
        }

        public GraphNode(E value) {
            this.value = value;
        }

        public E getValue() {
            return value;
        }
    }
}
