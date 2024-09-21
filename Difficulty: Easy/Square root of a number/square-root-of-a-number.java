//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        double d = (double) n;
        double sq = Math.sqrt(d);
        double res = Math.floor(sq);
        long sq1 = (long) sq;
        long res1 = (long) res;
        if (sq1 == res1){
            return sq1;
        }
        return res1;
    }
}
