package Graph_By_Striver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Implement_Graph_With_HashMap {
    public  static Map<Integer,List<Integer>> Introduction1(int n,int m,int[][]edges){
     Map<Integer,List<Integer>> adjList=new HashMap<>();
     for (int i=0;i<n;++i) {
         adjList.put(i, new ArrayList<>());
     }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return adjList;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] edges = {{1, 2}, {0, 3}, {2, 3}};
//         List<Integer> adjList = Introduction1(n, m, edges);
      Map<Integer,List<Integer>> adjList=Introduction1(n,m,edges);
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            int node = entry.getKey();
            List<Integer> neighbors = entry.getValue();
            System.out.print("Node " + node + " is connected to: ");
            for (int neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}




