// Count digits in a number
// Problem Statement: Given an integer N, return the number of digits in N.

class Digits{
    public static void digitsInNumber(int N){
        int count = 0;
        while (N > 0) {
            // int digit = N % 10 ;
            count ++ ;
            N = N / 10; 
            
        }
        System.out.println("Count of digits in a number is " + count);

    }

    public static void main(String [] args){
        int N = 9472;
        digitsInNumber(N);
    }
}