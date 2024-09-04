//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
            if (hashMap.get(arr[i])>arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }
}