// Pattern-2: Right-Angled Triangle Pattern
// Problem Statement: Given an integer N, print the following pattern : 

// Example:
// *
// **
// ***
// ****
// *****

class Pattern2{                         // class Pattern2()- Java class declarations don't use ().
    public static void pattern(int N){
                    // // Outer loop -> controls rows
        for (int i = 0 ; i<N ; i++){
                                             // // Inner loop -> prints stars
                                             // Number of stars = i + 1
            for (int j =0 ; j< i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}


                    // Complexity Analysis

                    /* Time Complexity: O(N²)      Why?
                    The outer loop runs N times:
                    i = 0 → 1 iteration
                    i = 1 → 2 iterations
                    i = 2 → 3 iterations
                    ...
                    i = N-1 → N iterations

                    The inner loop runs:       1 + 2 + 3 + ... + N
                    Which equals:            N(N + 1) / 2

                    Ignoring constants and lower-order terms:        O(N²)
                    */


                    // Space Complexity: O(1)

                    // You only use:

                    // int N
                    // int i
                    // int j

                    // No array, HashMap, recursion, etc.

                    // So:

                    // Time  → O(N²)
                    // Space → O(1)