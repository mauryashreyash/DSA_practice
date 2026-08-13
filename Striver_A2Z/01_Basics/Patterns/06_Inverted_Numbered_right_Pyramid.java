// Pattern - 6: Inverted Numbered Right Pyramid
// Problem Statement: Given an integer N, print the following pattern 


// 12345
// 1234
// 123
// 12
// 1

class pattern6{
    public static void pattern(int N){
        for(int i= 0; i<N ; i++){
            for(int j = 1 ; j <= N-i ; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        int N=5;
        pattern(N);
    }
}

// Time Complexity: O(N²)
// Reason: The inner loop runs N + (N-1) + ... + 1 times, which is O(N²).
//
// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.