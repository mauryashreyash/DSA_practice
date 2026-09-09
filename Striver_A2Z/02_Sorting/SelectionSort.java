// Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.

// Examples
// Example 1:
// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52


class SelectionSort{
    public static void selectionsort(int[] arr){
        for ( int i = 0; i <arr.length - 1 ; i++ ){
            int minIndex = i;
            
            // find the index of smallest element
            for( int j = i+1; j < arr.length ; j++){

                if( arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // SWAP
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }
    public static void main(String[] args) {
        int [] arr = { 23, 45, 13, 76, 39, 46, 29, 51};

        selectionsort(arr);

        for ( int num : arr){
            System.out.print(num + " ");
        }
    }
}