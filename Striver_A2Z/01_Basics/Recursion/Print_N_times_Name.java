// Print Name N times using Recursion

// Problem Description: Given an integer N, write a program to print your name N times.

// Examples
// Input: N = 3
// Output: Ashish Ashish Ashish 
// Explanation: Name is printed 3 times.

class Print_N_times_Name {
    static void printYourName(int N){

        if ( N == 0){
            return ;
            
        }
        else{
            System.out.println("Shreyash");
            printYourName(N-1);
        }
        

    }

    public static void main(String [] args){
        int N = 5;
        printYourName(N);
    }
}