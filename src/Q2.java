//Q2.java
//Q2 will contain the iterative algorithm which computes the nth triangular number.

//Austin Stephens
//Rasmussen University
//COT4530C Section 01 Algorithm and Data Structure Analysis
//Professor Kumar
//07/28/2024

//Question 2:
//Include its pre-conditions and post-conditions. Finally, prove by induction that the recursive algorithm is correct
//Given the following iterative algorithm which computes the
//nth triangular number:
//int tri(int n)
//{
//int result = 0;
//for (int i = 1; i = n; i ++)
//result += i;
//return result;
//}
//Convert this function to use recursion.
//Include its pre-conditions and post-conditions.
// Finally, prove by induction that the recursive algorithm is correct

public class Q2 {
    // Pre-conditions: n is a positive integer
    // Post-conditions: The nth triangular number is returned

    public static int tri(int n){
        //Base case for when n is 0
        if(n == 0) return 0;
        //Recursive case
        else
            //Return the sum of the previous triangular number and n
            return n + tri(n-1);
    }
}
