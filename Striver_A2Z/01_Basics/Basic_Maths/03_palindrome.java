class Palindrome{
    public static void palindrome(int N){
        int original = N;
        int pal = 0 ;
        while ( N > 0 ){
            int lastDigit = N % 10;
            pal = pal * 10 + lastDigit;
            N = N/10;
        }
            if( pal == original) {
                System.out.print(original + " Number is plaindrome.");
            }
            else {
            System.out.print(original + " Number is not plaindrome.");
            }
    }
    public static void main(String [] args){
        int N = 1234321;
        palindrome(N);
    }
}
