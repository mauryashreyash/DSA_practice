// Problem Statement: Given an array, we have to find the largest element in the array.

// Examples
// Input: arr[] = {2, 5, 1, 3, 0}  
// Output: 5  
// Explanation: 5 is the largest element in the array.
import java.util.Arrays;

class LastestNumber {

    public static int findLargest(int[] arr) {

        Arrays.sort(arr);

        return arr[arr.length - 1];
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 1, 3, 0};
        int[] arr2 = {8, 10, 5, 7, 9};

        System.out.println(
            "The Largest element in the array is: " + findLargest(arr1)
        );

        System.out.println(
            "The Largest element in the array is: " + findLargest(arr2)
        );
    }
}