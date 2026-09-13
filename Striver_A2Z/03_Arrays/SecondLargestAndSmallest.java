// Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.

// Examples
// Input: [1, 2, 4, 7, 7, 5]  
// Output: Second Smallest : 2  
//         Second Largest : 5  

class SecondLargestAndSmallest {

    // APPROACH : 01
    
    // public static void SecondMinMax(int [] arr){
        //     Arrays.sort(arr);
        
        //     System.out.println("second smallest element = " + arr[1]);
        //     System.out.print("second largestest element = " + arr[arr.length - 2]);
        
        //     // int[] SortedArray = ;        
        // }
        
        
        // APPROACH : 02
    public static void MinMax(int [] arr){
        int MIN = arr[0];
        int MAX = arr[0];

        for(int i = 1 ; i < arr.length ; i++){

            // finding minimum integer
            if (MIN > arr[i]){
                MIN = arr[i];
            }
            
            // finding maximum integer
            if (MAX < arr [i]){
                MAX = arr[i];
            }
        }

        System.out.println("Smallest number is : " + MIN);
        System.out.println("Largest number is : " + MAX);
        
    }  

    public static void main(String [] args){
        int [] arr = {1, 2, 4, 17, 7, 5};

        MinMax(arr);

        // SecondMinMax(arr);

    }
    
}
