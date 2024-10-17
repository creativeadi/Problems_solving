//{ Driver Code Starts

// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                arr.add(sc.nextInt());
            }
            Solution ob = new Solution();

            ArrayList<Integer> ans = ob.subsetSums(arr, N);
            Collections.sort(ans);
            for (int sum : ans) {
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    private static void sums(int index, int sum, int n, ArrayList<Integer> ans, ArrayList<Integer> arr){
        if (index == n){
            ans.add(sum);
            return;
        }
        sums(index+1, sum+arr.get(index), n, ans, arr); // picking the value at i.
        sums(index+1, sum, n, ans, arr); //not picking the value.
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        sums(0, 0, n, ans, arr);
        Collections.sort(ans);
        return ans;
    }
}