// Pattern - 9: Diamond Star Pattern
// Problem Statement: Given an integer N, print the following pattern : 

class Pattern9{
    public static void pattern( int n){
        for ( int i = 0 ; i < n ; i++){
            // Space
            for( int j=0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            // Star
            for( int j=0 ; j < 2*i+1 ; j++){
                System.out.print("*");
            }           
            System.out.println();
        }

        for ( int i = 0 ; i < n ; i++){
            // Space
            for( int j=0 ; j < i ; j++){
                System.out.print(" ");
            }
            // Star
            for( int j=0 ; j < 2*(n-i)-1 ; j++){
                System.out.print("*");
            }           
            System.out.println();
        }

    }
    public static void main(String [] args){
        int n = 5;
        pattern (n);
    }
}

// Time Complexity: O(N²)
// Reason: Both halves print O(N²) total spaces and stars.
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.