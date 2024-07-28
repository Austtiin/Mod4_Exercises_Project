//main.java
//This is where we will run our program

//Austin Stephens
//Rasmussen University
//COT4530C Section 01 Algorithm and Data Structure Analysis
//Professor Kumar
//07/28/2024


//We will seperate the prgoram into its own class, using the main class to run the program and other classes to handle the logic.
//The program will demonstrate the correctness of the following algorithms:
//Proof of Correctness Exercises
//Question 1:
//Given the following recursive algorithm for determining the Fibonacci numbers for any given value of n:
//int fibo(int n){
// if(n < = 1) return n;
//else
//  return fibo(n-1) + fibo(n-2);
//}
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
//Convert this function to use recursion. Include its pre-conditions and post-conditions. Finally, prove by induction that the recursive algorithm is correct
//Question 3:
//If the number of steps required in the worst case for two algorithms are:
//Algorithm 1: f(n) = 4n^2+ 6
//Algorithm 2: g(n) = 78n+ 25
//Calculate the point at which algorithm 2 becomes more efficient than algorithm 1.
//Question 4:
//Given the following algorithm for determining the factorial of a given number n:
//factorial(n)
// if (n == 0)
//   return 1 return n * (factorial - 1)
//Find the initial condition and recurrence equation that expresses the execution time for this algorithm
//Question 5:
//Write a recursive algorithm that computes the sum of natural numbers until N.

// Main.java
public class Main {
    public static void main(String[] args) {
        int testNum = 5;

        // Question 1
        System.out.println("Question 1: ");
        System.out.println("Fibonacci number for 5: " + Q1.fibo(testNum));

        // Question 2
        System.out.println("Question 2: ");
        System.out.println("Triangular number for 5: " + Q2.tri(testNum));

        // Question 3
        System.out.println("Question 3: ");
        System.out.println("The Point at when algorithm 2 becomes more efficient than algorithm 1: " + Q3.findEfficiencyPoint());

        // Question 4
        System.out.println("Question 4: ");
        System.out.println("Factorial of 5: " + Q4.factorial(testNum));

        // Question 5
        System.out.println("Question 5: ");
        System.out.println("Sum of natural numbers until 5: " + Q5.sum(testNum));
    }
}