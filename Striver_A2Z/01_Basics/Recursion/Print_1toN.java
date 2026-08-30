// Print 1 to N using Recursion
// Problem Description: Given an integer N, write a program to print numbers from 1 to N.

// Examples
// Input: N = 4
// Output: 1, 2, 3, 4
// Explanation: All the numbers from 1 to 4 are printed.

class Print1toN{
    public static void printNumber1toN( int N , int i){
        // int i = 0;
        if ( i > N){
            return;
        }
        else{
            System.out.println(i);
            printNumber1toN(N , i + 1);
        }

    }
    public static void main(String[] args) {
        int N = 10;
        printNumber1toN(N , 1);

    }
}