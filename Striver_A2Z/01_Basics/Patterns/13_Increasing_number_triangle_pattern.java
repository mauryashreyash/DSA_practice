// Pattern 13 is Increasing Number Triangle Pattern.

// For N = 5, the required output is:

// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15

class Pattern13{
    public static void pattern(int N) {
        int num = 1;
        for ( int i = 0 ; i< N; i++){
            for (int j = 0; j<=i ; j++){
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();

        }
    }
        public static void main(String[] args ){
            int N = 5;
            pattern(N);
        
    }
}
