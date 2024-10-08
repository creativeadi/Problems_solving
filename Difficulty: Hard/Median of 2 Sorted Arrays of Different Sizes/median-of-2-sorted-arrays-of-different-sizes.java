//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        ArrayList<Integer> arr=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr.add(a[i]);
        }
        
        for(int i=0;i<m;i++){
            arr.add(b[i]);
        }
        
        Collections.sort(arr);
        
        if(arr.size()%2!=0){
            double num=arr.get((arr.size()-1)/2);
            return num;
        }
        else{
            double num=arr.get((arr.size())/2)+arr.get(((arr.size())/2)-1);
            return num/2;
        }
    }
}