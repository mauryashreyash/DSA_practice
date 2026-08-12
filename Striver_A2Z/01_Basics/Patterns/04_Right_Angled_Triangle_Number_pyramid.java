// Pattern - 4: Right-Angled Number Pyramid - II
// Problem Statement: Given an integer N, print the following pattern : 

// 1
// 22
// 333
// 4444
// 55555

class pattern4{
    public static void pattern(int N) {
        for ( int i = 0 ; i < N ; i++){
            for ( int j = 0; j< i+1 ; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    public static void main( String []Args){
        int N = 5;
        pattern(N);  
        
    }
}


// Time Complexity: O(N²)
// Reason: The nested loops together print 1 + 2 + ... + N elements, which is O(N²).

// Space Complexity: O(1)
// Reason: Only loop variables are used; no extra data structure is required.