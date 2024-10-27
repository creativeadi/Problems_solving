//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
    if (N <= 1) return 0; // Early exit for non-perfect numbers

    long sum = 1; // 1 is always a divisor

    // Loop through potential divisors up to sqrt(N)
    for (long i = 2; i * i <= N; i++) {
        if (N % i == 0) {
            sum += i;
            // Add the corresponding divisor if it's different from 'i'
            if (i != N / i) {
                sum += N / i;
            }
        }
    }

    // Check if the sum of divisors equals the original number
    return sum == N ? 1 : 0;
}

};