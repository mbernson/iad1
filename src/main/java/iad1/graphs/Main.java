package iad1.graphs;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try {
            main();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void main() throws Exception {
        String path = "/Users/mathijs/Hogeschool/iad1/build/resources/test/graph.txt";
        Graph g = new Graph(new DataInputStream(new FileInputStream(path)));
    }
}
