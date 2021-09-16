// Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.


// Example 1:

// Input:
// N = 4
// arr[] = {1, 5, 3, 2}
// Output: 1
// Explanation: 
// Sum of first 2 elements is 1 + 5  = 6, 
// Sum of last 2 elements is 3 + 2  = 5,
// To make the array balanced you can add 1.

// Example 2:

// Input:
// N = 6
// arr[] = { 1, 2, 1, 2, 1, 3 }
// Output: 2
// Explanation:
// Sum of first 3 elements is 1 + 2 + 1 = 4, 
// Sum of last three elements is 2 + 1 + 3 = 6,
// To make the array balanced you can add 2.
 

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function minValueToBalance() which takes the array a[] and N as inputs and returns the desired result.

 

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

 

// Constraints:
// 2<=N<=107
// N%2==0


import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java


class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
    long sm1=0;
    long sm2=0;
   for(int i=0;i<n/2;i++){
   
       sm1=sm1+a[i];
   }
   
   for(int i=n/2;i<n;i++){
   
       sm2=sm2+a[i];
   }
   
   if(sm1>sm2){
       return sm1-sm2;
   }
   else{
       return sm2-sm1;
   }
    }
}


// { Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            
            long ans=ob.minValueToBalance(a,n);
            System.out.println(ans);
        }
    }
}



  // } Driver Code Ends