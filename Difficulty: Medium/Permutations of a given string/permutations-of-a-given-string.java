//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public void findIt(int index, char[] arr, Set<String> ans) {
        if (index == arr.length) {
            ans.add(new String(arr));  // Convert char array to string and add to set
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            findIt(index + 1, arr, ans);
            swap(i, index, arr);  // Backtrack to restore the original state
        }
    }

    private void swap(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public List<String> find_permutation(String s) {
        // Code here
        Set<String> ans = new HashSet<>();  // Use Set to avoid duplicates
        findIt(0, s.toCharArray(), ans);
        List<String> result = new ArrayList<>(ans);
        Collections.sort(result);  // Sort lexicographically
        return result;
    }
}