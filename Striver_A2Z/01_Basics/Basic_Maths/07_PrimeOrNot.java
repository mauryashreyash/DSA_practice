// Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2..

// Example:
// Example 1:
// Input:N = 2
               
// Output:True
                
// Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).
                                                                

class PrimeOrNot{
    public static void checkForPrime(int n){

        if ( n < 2 ){
            System.out.println(n + "is not a prime number.");
            return;
        }

        for( int i =2 ; i*i <= n ; i++ ){
            if ( n % i == 0){
                System.out.println(n + "is not a prime number.");
            return;
            }            
        }
        System.out.println(n + " is a prime number.");
    }
    public static void main(String[] args) {
        int n = 67;
        checkForPrime(n);
    }
}