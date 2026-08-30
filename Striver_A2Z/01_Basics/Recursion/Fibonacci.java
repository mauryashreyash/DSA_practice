// Print Fibonacci Series up to Nth term
// Problem Statement: Given an integer N. Print the Fibonacci series up to the Nth term.

// Examples
// Example 1: Input: N = 5
// Output: 0 1 1 2 3 5
// Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)

class Fibonacci{
    public static void fibNumber( int N){
        // As we know fib(i) = fib(i-1) + fib(i-2)

        int a = 0;
        int b = 1;

        for( int i = 0 ; i<N+1 ; i++){
            System.out.print(a + " ");
            int next = a + b ;
            a = b;
            b = next;
        }
    //    return next;       
       
    }
    
    public static void main(String[] args) {
        int N = 5;
        fibNumber(N);

    }
}