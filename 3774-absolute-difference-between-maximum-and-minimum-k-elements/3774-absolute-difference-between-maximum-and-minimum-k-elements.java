class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);

        int leastSum = 0 ;
        for ( int i = 0 ; i<k ; i++){
            leastSum += nums[i];
        }
        int maxSum = 0;
        for(int i = nums.length - k; i < nums.length; i++){
            maxSum += nums[i];
        }       
        return Math.abs(maxSum - leastSum);
        // return (maxSum - leastSum); 
    }

    public static void main(String [] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k = 2;

        Solution sol = new Solution();
        int answer = sol.absDifference(nums, k);
        System.out.println(answer);
    }
}