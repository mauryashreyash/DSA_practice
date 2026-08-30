// Reverse a given Array
// Problem Statement: You are given an array. The task is to reverse the array and print it.

// Examples
// Input: N = 5, arr[] = {5,4,3,2,1}
// Output: {1,2,3,4,5}
// Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.

class RevOfArr{
    public static void Reverse(int [] arr){
        int left = 0;
        int right = arr.length - 1;


        while( left <= right){

            //swap
            int temp = arr[left];
            arr [left] = arr [right];
            arr [right] = temp;

            left ++;
            right --;
            
        }
    }

    public static void main(String[] args){

        int[] arr = {17 ,25 , 3 ,34 , 85};
        Reverse(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
                //         Enhanced for loop
                // for (int i : arr) {
                //     System.out.print(i + " ");
                        // }
    }
}