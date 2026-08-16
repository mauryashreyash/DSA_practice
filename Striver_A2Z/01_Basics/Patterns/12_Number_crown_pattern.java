// Pattern 12 is the Number Crown Pattern.

// For N = 4, the target is:

// 1             1
// 1 2         2 1
// 1 2 3     3 2 1
// 1 2 3 4 4 3 2 1

class Pattern12{
    public static void pattern( int n){
        for ( int i = 0 ; i < n ; i++){
            // Left numbers
            for( int j=1 ; j <= i+1 ; j++){
                System.out.print(j);
            }
            // Spaces
            for( int j=0 ; j < 2*(n-i-1) ; j++){
                System.out.print(" ");
            }   
            // Right numbers
            for( int j=i+1 ; j >= 1 ; j--){
                System.out.print(j);
            }        


            System.out.println();
        }
    }
    public static void main(String [] args){
        int n = 5;
        pattern (n);
    }
}