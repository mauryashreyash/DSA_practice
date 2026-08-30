// Factorial of a Number : Iterative and Recursive
// Problem Statement: Given a number X,  print its factorial.
// To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

// Note: X  is always a positive number. 
// Examples
                // Input: X = 5
                // Output: 120
                // Explanation: 5! = 5*4*3*2*1

class Factorial{
    public static int fact(int N){
        if (N == 0){
            return 1;
        }
        return N * fact(N-1);
    }
// fact(5)
// = 5 * fact(4)
// = 5 * 4 * fact(3)
// = 5 * 4 * 3 * fact(2)
// = 5 * 4 * 3 * 2 * fact(1)
// = 5 * 4 * 3 * 2 * 1 * fact(0)
// = 120

    public static void main(String[] args) {
        int N = 5;
        fact(N);
        System.out.println("Factorial of " + N + " is : " + fact(N));
    }
}