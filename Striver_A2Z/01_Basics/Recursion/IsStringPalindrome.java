// Check if the given String is Palindrome or not
// Problem Statement: Given a string, check if the string is palindrome or not. A string is said to be palindrome if the reverse of the string is the same as the string.

// Examples
// Example 1:Input: Str =  “ABCDCBA”
// Output: Palindrome
// Explanation: String when reversed is the same as string.


//                                                     Algorithm
// To check whether a string is a palindrome, we only need to compare characters from the start and end, moving towards the center.
// Run a for loop from i = 0 to i < str.length() / 2.
// This ensures that each character is compared with its corresponding character from the end.
// In each iteration, compare the character at the front str[i] with the character at the back str[str.length() - i - 1].
// If at any point these characters do not match, return false as the string is not a palindrome.
// If the loop completes without returning false, then the string is a palindrome, and we return true.

class IsPalindrome{
    public static boolean palindrome(String A){
        for( int i = 0 ; i < A.length() / 2 ; i++ ){

            if( A.charAt(i) != A.charAt(A.length() - i -1))      return false;
        }
        return true;
    }


    public static void main(String[] args) {
        String A = "ABCDKDCBA" ;
        if (palindrome(A)) System.out.println("YES, it is Palindrome!!!");
        else System.out.println("NO, It is not a Palindrome !!!");

    }
}