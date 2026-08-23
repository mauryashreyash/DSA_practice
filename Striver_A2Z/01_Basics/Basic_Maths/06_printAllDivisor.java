// Print all Divisors of a given Number

// Problem Statement: Given an integer N, return all divisors of N.
// A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words, if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

// Examples
// Input: N = 36
// Output: [1, 2, 3, 4, 6, 9, 12, 18, 36]  
// Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.


class Divisors{
    public static void allDivisors(int a){
        for( int i = 1 ; i <= a/2 ; i++){
            if( a % i == 0 ){
                System.out.print(i + ", ");
            }

        }
    }

    public static void main(String[] args) {
        int a = 36;
        allDivisors(a);
    }
}


// Time: O(n)
// Space: O(1)

// Next improvement : There's a faster O(√n) approach.