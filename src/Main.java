import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Vertex<String> S = new Vertex<>("S");
        Vertex<String> T = new Vertex<>("T");
        Vertex<String> X1 = new Vertex<>("X1");
        Vertex<String> X2 = new Vertex<>("X2");
        Vertex<String> X3 = new Vertex<>("X3");
        Vertex<String> X4 = new Vertex<>("X4");

        S.setNeighbors(new HashMap<>(Map.of(X1, 7, X2, 9, X3, 5, X4, 3)));
        X1.setNeighbors(new HashMap<>(Map.of(X2, 3, T, 2)));
        X2.setNeighbors(new HashMap<>(Map.of(T, 14)));
        X3.setNeighbors(new HashMap<>(Map.of(X4, 4)));
        X4.setNeighbors(new HashMap<>(Map.of(T, 18)));

        System.out.print("The Max Flow is: ");
        System.out.println(new FordFulkerson<String>().findMaximumFlow(S, T));

    }

}