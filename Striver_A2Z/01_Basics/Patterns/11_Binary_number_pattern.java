class Pattern11 {
    public static void pattern(int N) {    
            for (int i = 0; i < N; i++) {
            int num = (i % 2 == 0) ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                // print num
                System.out.print(num);

                // switch 0 ↔ 1
                num = 1 - num ;
// Why 1 - num?
// It's a neat trick:

// num = 1 → 1 - 1 = 0
// num = 0 → 1 - 0 = 1

// So it automatically toggles:1 → 0 → 1 → 0 → 1

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N = 5;
        pattern(N);
    }
}