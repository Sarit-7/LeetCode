//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        
        int a = 0, b = 1;
        int c = 0; // Initialize c to 0
        int MOD = 1000000007;
        
        for (int i = 2; i <= n; i++) { // Fix loop condition
            c = (a + b) % MOD; // Apply modulo operation
            a = b;
            b = c;
        }
        
        return c;
    }
}