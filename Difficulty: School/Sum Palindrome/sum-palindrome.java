//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.isSumPalindrome(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static boolean isPal(long n){
        long rev=0,temp=n;
        while(temp!=0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(rev==n){
            return true;
        }else{
            return false;
        }
    }
    static long reverse(long n){
        long rev=0,temp=n;
        while(temp!=0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        return rev;
    }
    static long isSumPalindrome(long n) {
        for(int i=0;i<=5;i++){
            if(isPal(n)){
                //if the n is palindrome
                return n;
            }else{
                //if not palindrome than reverse it and add to n 
                n=reverse(n)+n;
            }
        }
      return -1; 
    }
}