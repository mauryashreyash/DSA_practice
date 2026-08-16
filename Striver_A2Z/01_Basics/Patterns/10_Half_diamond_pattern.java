// Pattern - 10: Half Diamond Star Pattern
// Problem Statement: Given an integer N, print the following pattern : 

class Pattern10{
    public static void pattern(int N) {
        for ( int i = 0 ; i< N; i++){
            for (int j = 1; j<=i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for( int i=1 ; i<N ; i++){
            // for (int j = N; j < i + 1; j--)
            for (int j = 0; j< N-i; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
        public static void main(String[] args ){
            int N = 5;
            pattern(N);
        
    }
}

// Time Complexity: O(N²)
// Reason: The total number of stars printed is N².
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.