//Q4.java
//Q4 will contain the algorithm for determining the factorial of a given number n.

//Austin Stephens
//Rasmussen University
//COT4530C Section 01 Algorithm and Data Structure Analysis
//Professor Kumar
//07/28/2024

//Question 4:
//Given the following algorithm for determining the factorial of a given number n:
//factorial(n)
// if (n == 0)
//        return 1 return n * (factorial - 1)
//Find the initial condition and recurrence equation that expresses the execution time for this algorithm

public class Q4 {
    // Pre-conditions: n is a positive integer
    // Post-conditions: The factorial of n is returned

    public static int factorial(int n){
        //Base case for when n is 0
        if (n == 0)
            return 1;
        //Recursive case
        //Return the product of n and the factorial of n-1
        return n * factorial(n-1);
    }
}