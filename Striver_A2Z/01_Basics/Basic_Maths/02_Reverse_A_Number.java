// Reverse Digits of A Number

// Problem Statement: Given an integer N return the reverse of the given number.

// Input: N = 12345
// Output:54321

class Solution{
    public static void RevOfNumber(int N){
        int rev = 0;
        while ( N > 0){
            int lastDigit = N % 10;
            rev = rev*10 + lastDigit;
            N = N/10;
               }
               System.out.println("reverse of number " + ":" + rev);

    }

    public static void main(String [] args){
        int N = 12345;
        RevOfNumber(N);
    }

}
