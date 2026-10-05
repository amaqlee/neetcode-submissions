class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0;
        int bottom = rows - 1;
        while(top <= bottom){
            int middle = top + (bottom - top)/2;
            //is tagret greater than greatest value in row
            if(target > matrix[middle][cols-1]){
                top = middle + 1;
            }else if(target < matrix[middle][0]){
                bottom = middle -1;
            }else{
                break;
            }
        }
        if(top > bottom){
            return false;
        }

        int row = (top + bottom)/2;
        int l = 0;
        int r = cols-1;
        while(l <= r){
            int m = l + (r-l)/2;
            if(target > matrix[row][m]){
                l = m + 1;
            }else if(target < matrix[row][m]){
                r = m - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
