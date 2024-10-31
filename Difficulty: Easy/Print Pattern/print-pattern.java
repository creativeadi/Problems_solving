//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine().trim());
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.pattern(N);
            for(int i = 0;i < ans.size();i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public List<Integer> pattern(int N){
        // code here
        int current = N;
        List<Integer> ans = new ArrayList<>();
        // Decrement by 5 until reaching 0 or a negative number
        while (current > 0) {
            ans.add(current);
            current -= 5;
        }
    
        // Add the last non-positive number (either 0 or negative)
        ans.add(current);
    
        // Increment by 5 to return back to the original value N
        while (current != N) {
            current += 5;
            ans.add(current);
        }
    
        return ans;
    }
}