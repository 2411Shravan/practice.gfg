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
//Initial Template for javascript

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();
});

function readLine() {
    return inputString[currentLine++];
}

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++){
            arr[i] = input_ar1[i];
        }
        let obj = new Solution();
        let res = obj.minNum(arr, n);
        console.log(res);
        
    }
}// } Driver Code Ends

// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number[]} arr
 * @param {number} n
 * @returns {number}
*/

class Solution{
    minNum(arr,n){
        //code here
         let sum=0;
	    for(let i=0;i<n;i++){
	        sum=sum+arr[i];
	    }
	    
	    if((sum+2)%2==0){
	        return 2;
	    }
	    else{
	        return 1;
	    }
    }
}