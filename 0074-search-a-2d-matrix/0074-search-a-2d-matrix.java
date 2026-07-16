class Solution {

    public boolean BS(int[][] matrix, int target, int row) {
        int start = 0;
        int end = matrix[row].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[row][mid] == target)
                return true;

            if (matrix[row][mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
                if (BS(matrix, target, i))
                    return true;
            }
        }

        return false;
    }
}