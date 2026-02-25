class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int rows = mat.length;
        int cols = mat[0].length;
        
        int left = 0;
        int right = cols - 1;
        
        while (left <= right) {
            int midCol = left + (right - left) / 2;
            
            // Find max element in mid column
            int maxRow = 0;
            for (int i = 0; i < rows; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }
            
            int leftVal = (midCol - 1 >= 0) ? mat[maxRow][midCol - 1] : -1;
            int rightVal = (midCol + 1 < cols) ? mat[maxRow][midCol + 1] : -1;
            
            if (mat[maxRow][midCol] > leftVal && 
                mat[maxRow][midCol] > rightVal) {
                return new int[]{maxRow, midCol};
            }
            
            else if (rightVal > mat[maxRow][midCol]) {
                left = midCol + 1;
            } else {
                right = midCol - 1;
            }
        }
        
        return new int[]{-1, -1};
    }
}
