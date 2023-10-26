package Graph_By_Striver;

import java.util.ArrayList;
import java.util.List;

public class G2 {
    public  static List<List<Integer>> Introduction(int n,int m,int [][]edges){
      List<List<Integer>> adjList=new ArrayList<>();
      for (int i=0;i<n;++i) {
          adjList.add(new ArrayList<>());
          adjList.get(i).add(i);
      }
        for (int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        return  adjList;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] edges = {{1, 2}, {0, 3}, {2, 3}};
        List<List<Integer>> adjList = Introduction(n, m, edges);
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
