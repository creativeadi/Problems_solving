//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		
System.out.println("~");
}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int c = 0;
        int x = 0;
        String st = Integer.toBinaryString(n);
        int len = st.length();
        for (int i=len-1; i>=0; i--){
            c++;
            if (st.charAt(i) == '1'){
                x = c;
                break;
            }
        }
        return x;
    }
}