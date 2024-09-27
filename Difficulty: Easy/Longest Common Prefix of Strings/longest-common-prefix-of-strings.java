//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        
        int minlen =0;
        String first = arr[0];
        String last = arr[arr.length-1];
        minlen = Math.min(first.length(), last.length());
        
        
        int i=0;
        
        while(i< minlen && first.charAt(i)==last.charAt(i)){
            i++;
        }
        
        if(i==0){
            return "-1";
        }
        return first.substring(0,i);
    }
}