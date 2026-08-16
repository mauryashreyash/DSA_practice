// Pattern 16: Alpha-Ramp Pattern.

// For N = 5, the output is:

// A
// B B
// C C C
// D D D D
// E E E E E

class Pattern16{
    public static void pattern(int N){
        for( int i = 0 ; i <N ; i++){
            for( int j = 0 ; j<=i ; j++){
            System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }
    public static void main ( String[] args){
        int N = 5;
        pattern(N);
    }
}

// Time Complexity: O(N²)
// Reason: Total characters printed = 1 + 2 + ... + N = O(N²).
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.