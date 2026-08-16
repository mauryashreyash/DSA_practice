// Pattern 14: Increasing Letter Triangle Pattern.

// For N = 5:

// A
// A B
// A B C
// A B C D
// A B C D E

class Pattern14 {

    public static void pattern(int N) {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j <= i; j++) {

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
// Reason: Total characters printed = 1 + 2 + ... + N = O(N²).
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.