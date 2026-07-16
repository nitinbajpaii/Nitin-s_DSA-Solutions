class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int row=0;
        int col=cols-1;

        while(row<rows && col>=0){
            if(mat[row][col]==target){
                return true;
            }
            if(mat[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}