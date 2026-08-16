// Stars  = 2 * (N - i) - 1   // decrease
// Spaces = i                 // increase


class pattern8{
    public static void Pattern( int n){
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
        Pattern (n);
    }
}

// Time Complexity: O(N²)
// Reason: Across N rows, the total number of spaces and stars printed is O(N²).
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.