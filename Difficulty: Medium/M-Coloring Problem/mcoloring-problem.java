//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());      // Number of vertices
            String[] arrInput = br.readLine().trim().split(" "); // Input for edges

            List<int[]> edges = new ArrayList<>();
            for (int i = 0; i < arrInput.length; i += 2) {
                int u = Integer.parseInt(arrInput[i]);
                int v = Integer.parseInt(arrInput[i + 1]);
                edges.add(new int[] {u, v});
            }

            int m = Integer.parseInt(br.readLine().trim()); // Number of colors

            Solution sol = new Solution();
            System.out.println(sol.graphColoring(n, edges, m) ? "true" : "false");
        }
    }
}

// } Driver Code Ends


class Solution {
    private static boolean graphCol(int node, List<int[]> edges, int m, int[] colors){
        if (colors.length == node){
            return true;
        }
        for (int i=1; i<=m; i++){
            if (isPossible(node, edges, colors, i)){
                colors[node] = i;
                if (graphCol(node+1, edges, m, colors)){
                    return true;
                }
                colors[node] = 0;
            }
        }
        return false;
    }
    
    private static boolean isPossible(int node, List<int[]> edges, int[] colors, int i){
        for (int[] col : edges) {
            if (col[0] == node && colors[col[1]] == i) {
                return false; // Adjacent vertex has the same color
            }
            if (col[1] == node && colors[col[0]] == i) {
                return false; // Adjacent vertex has the same color
            }
        }
        return true;
    }
    boolean graphColoring(int v, List<int[]> edges, int m) {
        // code here
        int colors[] = new int[v];
        return graphCol(0, edges, m, colors);
    }
}