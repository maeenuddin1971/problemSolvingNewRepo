package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchGraph {
    static Boolean[] allAdj;

    public static void main(String[] args) {
        int V = 5;
        allAdj = new Boolean[V];
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
            allAdj[i] = Boolean.FALSE;
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);

        allAdj[0] = Boolean.TRUE;

        System.out.println("Starting from 0");
        performBFS(0, adj);
    }

    public static void addEdge(List<List<Integer>> lists, int first, int second) {
        lists.get(first).add(second);
        lists.get(second).add(first);
    }

    public static void performBFS(int startNode, List<List<Integer>> lists) {
        Queue<Integer> pk = new LinkedList<>();
        pk.add(startNode);

        while (!pk.isEmpty()) {
            int curr = pk.poll();
            System.out.println("Visited "+ curr);

            for (int x : lists.get(curr)) {
                if (!allAdj[x]) {
                    allAdj[x] = true;
                    pk.add(x);
                }
            }
        }
    }
}
