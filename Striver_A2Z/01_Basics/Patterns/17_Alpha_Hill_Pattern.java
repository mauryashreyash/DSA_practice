// Pattern 17: Alpha-Hill Pattern.

// For N = 4, the required output is:

//       A
//     A B A
//   A B C B A
// A B C D C B A

class Pattern17 {

    public static void pattern(int N) {

        for (int i = 0; i < N; i++) {

            // Spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Increasing letters
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }

            // Decreasing letters
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 4;
        pattern(N);
    }
}