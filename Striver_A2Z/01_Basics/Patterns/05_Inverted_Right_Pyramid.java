// Pattern-5: Inverted Right Pyramid
// Problem Statement: Given an integer N, print the following pattern :

class Pattern5{
    public static void Pattern(int N){
        for( int i=0 ; i<N ; i++){
            // for (int j = N; j < i + 1; j--)
            for (int j = 0; j< N-i; j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String [] args){
        int N= 5;
        Pattern(N);
    }
}


// Time Complexity: O(N²)
// Reason: The inner loop runs N + (N-1) + ... + 1 times, which is O(N²).

// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.