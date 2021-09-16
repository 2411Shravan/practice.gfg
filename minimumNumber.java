// Given an array arr[] of size N, the task is to add the minimum number(should be greater than 0) to the array so that the sum of the array becomes even

 

// Example 1:

// Input: N = 8
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
// Output:  2
// Explanation:  Sum of array is 36, so 
// we add minimum number 2 to make the 
// sum even.

// Example 2:

// Input: N = 9
// arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9}
// Output:  1
 

// Your Task:
// This is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function minNum() that takes array A and integer N as parameters and returns the minimum number required to the array so that the sum becomes even.

 

// Expected Time Complexity: O(N). 
// Expected Auxiliary Space: O(1).

 

// Constraints:
// 1 ≤ N ≤ 106


// { Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java



class Solution
{
    long minNum(long A[], int N)
    {
        // Your code goes here
        long sum=0;
	    for(int i=0;i<N;i++){
	        sum=sum+A[i];
	    }
	    
	    if((sum+2)%2==0){
	        return 2;
	    }
	    else{
	        return 1;
	    }
    }
}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int m =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < n; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            long ans=ob.minNum(a,n);
            System.out.println(ans);
        }
    }
}

