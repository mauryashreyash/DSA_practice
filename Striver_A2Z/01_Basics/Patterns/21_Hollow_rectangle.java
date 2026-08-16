// Pattern 21: Hollow Rectangle Pattern.

// For N = 5, the pattern shown is:

// * * * *
// *     *
// *     *
// * * * *


// if (i == 0 || i == N - 1 || j == 0 || j == N - 1)
class Pattern21{
    public static void pattern(int N){
        for (int i = 0; i<N ; i++){
            for ( int j =0; j< N ; j++){

                if (i == 0 || i == N - 1 || j == 0 || j == N - 1){
                System.out.print("*");  }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

        public static void main(String [] args){
            int N = 5;
            pattern(N);
        
    }
}


// Time Complexity: O(N²)
// Reason: We visit every cell of the N × N rectangle.
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.