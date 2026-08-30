// Print N to 1 using Recursion
// Problem Description: Given an integer N, write a program to print numbers from N to 1.

// Examples
// Input: N = 4
// Output: 4, 3, 2, 1
// Explanation: All the numbers from 4 to 1 are printed.

class PrintNto1{
    public static void printNumberNto1( int N ){
        // int i = 0;
        if ( N < 1){
            return;
        }
        
        System.out.println(N);
        printNumberNto1(N - 1);
        

    }
    public static void main(String[] args) {
        int N = 10;
        printNumberNto1(N );

    }
}