// Find GCD of two numbers
// Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

// Input: N1 = 9, N2 = 12

// Output: 3
// Explanation:
// Factors of 9: 1, 3, 9
// Factors of 12: 1, 2, 3, 4, 6, 12
// Common Factors: 1, 3
// Greatest common factor: 3 (GCD)

class GCDproblem{
    public static void findGCD ( int a,  int b){
        while ( b != 0){          
            int remainder =  a % b;
            a = b;
            b = remainder ;
        }
        System.out.println("GCD is : " + a);
    }
    public static void main(String [] args){
        int a = 36;
        int b = 9;
        findGCD (a , b);
    }
}