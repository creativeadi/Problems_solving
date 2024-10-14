//{ Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            Solution ob = new Solution();
            
            res = ob.combinationSum(list, sum);
            if (res.size() == 0) {
    			out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 out.print(" ");
    				}
    				out.print(")");
    			}
    		}
    		out.println();
    		res.clear();
	    }
	    out.flush();
    }
    
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        Collections.sort(A);
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(A.get(0));

        for(int i=1;i<A.size();i++){
            if(A.get(i)==A.get(i-1)) continue;
            else    arr.add(A.get(i));
        }


        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr, B, new ArrayList<>(), res, 0, 0);
        
        return res;
        
    }
    
    static void helper(ArrayList<Integer> arr, int B, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res, int sum, int ind){


        if(sum > B) return;
        if(sum == B){
            res.add(list);
        } 
        for(int i=ind; i<arr.size(); i++){
            list.add(arr.get(i));
            sum += arr.get(i);
            helper(arr, B, new ArrayList<>(list), res, sum, i);
            list.remove(list.size()-1);
            sum -= arr.get(i);
        }
        
    }
    
}