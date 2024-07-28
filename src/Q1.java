//Q1.java
//Q1 will contain the recursive algorithm for determining the Fibonacci numbers for any given value of n.
//The pre-conditions and post-conditions will be included.

//Austin Stephens
//Rasmussen University
//COT4530C Section 01 Algorithm and Data Structure Analysis
//Professor Kumar
//07/28/2024

//Question 1:
//Given the following recursive algorithm for determining the Fibonacci numbers for any given value of n:
//int fibo(int n){
// if(n < = 1) return n;
//else
//  return fibo(n-1) + fibo(n-2);
//}


public class Q1 {

    // Pre-conditions: n is a positive integer
    // Post-conditions: The nth Fibonacci number is returned

    public static int fibo(int n){
        //Base case for when n is less than or equal to 1
        if(n <= 1) {
            return n;
        }
        //Recursive case
        //Return the sum of the previous two Fibonacci numbers
        else
            return fibo(n-1) + fibo(n-2);
    }
}
