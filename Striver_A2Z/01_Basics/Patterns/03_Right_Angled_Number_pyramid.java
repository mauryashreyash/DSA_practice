// Pattern - 3: Right-Angled Number Pyramid
// Problem Statement: Given an integer N, print the following pattern : 

// 1
// 12
// 123
// 1234
// 12345

class Pattern3{
    public static void pattern(int N) {
        for ( int i = 0 ; i< N; i++){
            for (int j = 1; j<=i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
        public static void main(String[] args ){
            int N = 5;
            pattern(N);
        
    }
}

/*
Complexity

There are:1 + 2 + 3 + ... + N

number prints.That is:N(N + 1) / 2

Therefore:
Time: O(N²)

Space: O(1) 
 */