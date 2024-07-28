//Q5.java
//Q5 will contain the algorithm to calculate the point at which algorithm 2

//Austin Stephens
//Rasmussen University
//COT4530C Section 01 Algorithm and Data Structure Analysis
//Professor Kumar
//07/28/2024

//Question 5:
//Write a recursive algorithm that computes the sum of natural numbers until N.

public class Q5 {
    // Pre-conditions: n is a positive integer
    // Post-conditions: The sum of the natural numbers until n is returned

    public static int sum(int n){
        //Base case for when n is 0
        if(n == 0) return 0;
        //Recursive case
        else
            //Return the sum of the previous natural number and n
            return n + sum(n-1);
    }
}
