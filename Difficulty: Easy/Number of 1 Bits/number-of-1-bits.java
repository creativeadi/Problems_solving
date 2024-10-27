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

            Solution ob = new Solution();
            int cnt = ob.setBits(N);
            System.out.println(cnt);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int c = 0;
        String st = Integer.toBinaryString(n);
        int len = st.length();
        for (int i=0; i<len; i++){
            if (st.charAt(i) == '1'){
                c++;
            }
        }
        return c;
    }
}