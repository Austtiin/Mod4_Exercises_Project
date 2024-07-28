//Q3.java
//Q3 will contain the algorithm to calculate the point at which algorithm 2
// becomes more efficient than algorithm 1.

//Austin Stephens
//Rasmussen University
//COT4530C Section 01 Algorithm and Data Structure Analysis
//Professor Kumar
//07/28/2024

//Question 3:
//If the number of steps required in the worst case for two algorithms are:
//Algorithm 1: f(n) = 4n^2+ 6
//Algorithm 2: g(n) = 78n+ 25
//Calculate the point at which algorithm 2 becomes more efficient than algorithm 1.

// Q3.java
public class Q3 {

    public static int findEfficiencyPoint() {
        int n = 0;
        // Loop until g(n) is less than f(n)
        while (true) {
            // f(n) = 4n^2 + 6
            int f = 4 * n * n + 6;
            // g(n) = 78n + 25
            int g = 78 * n + 25;

            // If g(n) is less than f(n), return n
            if (g < f) {
                // Return the point at which algorithm 2 becomes more efficient than algorithm 1
                return n;
            }
            n++;
        }
    }

    public static void main(String[] args) {
        int efficiencyPoint = findEfficiencyPoint();
        System.out.println("The Point at when algorithm 2 becomes more efficient than algorithm 1: " + efficiencyPoint);
    }
}