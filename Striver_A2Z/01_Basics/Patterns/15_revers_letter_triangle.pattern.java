// Pattern 15: Reverse Letter Triangle Pattern.

// For N = 5, the output is:

// A B C D E
// A B C D
// A B C
// A B
// A

class Pattern15 {
    public static void pattern(int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N-i; j++) {

                // print the character
                    System.out.print((char)('A' + j) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}


// Time Complexity: O(N²)
// Reason: Total characters printed = N + (N-1) + ... + 1 = O(N²).
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.