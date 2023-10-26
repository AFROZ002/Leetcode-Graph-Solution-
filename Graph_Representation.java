package Graph_By_Striver;
//import java.util.*;

public class Graph_Representation {
    public static int[][] printAdjacency(int n, int m, int[][] edges) {

        int[][] adjList = new int[n][];
        for (int i = 0; i < n; i++) {
            adjList[i] = new int[1];
//            adjList[i][0] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList[u] = addElement(adjList[u], v);
            adjList[v] = addElement(adjList[v], u);

        }

        return adjList;

    }

    public static int[] addElement(int[] arr, int element) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = element;
        return newArr;
    }
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[][] edges = { { 1, 2 }, { 0, 3 }, { 2, 3 } };
        int[][] adjList = printAdjacency(n, m, edges);
        for (int i = 0; i < adjList.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adjList[i].length; j++) {
                System.out.print(adjList[i][j] + " ");
            }
            System.out.println();
        }
    }
}