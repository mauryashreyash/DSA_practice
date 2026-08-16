// Pattern - 7: Star Pyramid
// Problem Statement: Given an integer N, print the following pattern : 

// space = n - i - 1
// star = 2 * i + 1

class pattern7{
    public static void Pattern( int n){
        for ( int i = 0 ; i < n ; i++){
            // Space
            for( int j=0 ; j < n-i-1 ; j++){
                System.out.print(" ");
            }
            // Star
            for( int j=0 ; j < 2*i+1 ; j++){
                System.out.print("*");
            }           
            System.out.println();
        }
    }
    public static void main(String [] args){
        int n = 5;
        Pattern (n);
    }
}