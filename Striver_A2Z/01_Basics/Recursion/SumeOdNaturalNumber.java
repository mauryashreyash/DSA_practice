// Sum of first N Natural Numbers

// Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers .

// Examples
// Input: N=5
// Output: 15
// Explanation: 1+2+3+4+5=15

class SumOfNaturalNumber{
    public static int sum( int N){
        int sum = 0;
        if ( N == 1){
            return 1;
        }
        // sum = sum + N;
        return N + sum(N - 1);

    }

    public static void main(String[] args) {
        int N = 11 ;
        sum(N);
        System.out.println(sum(N));
    }
}