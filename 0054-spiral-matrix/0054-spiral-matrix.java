class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;

        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse Right
            for (int c = colStart; c <= colEnd; c++) {
                res.add(matrix[rowStart][c]);
            }
            rowStart++;

            // Traverse Down
            for (int r = rowStart; r <= rowEnd; r++) {
                res.add(matrix[r][colEnd]);
            }
            colEnd--;

            // Traverse Left
            if (rowStart <= rowEnd) {
                for (int c = colEnd; c >= colStart; c--) {
                    res.add(matrix[rowEnd][c]);
                }
                rowEnd--;
            }

            // Traverse Up
            if (colStart <= colEnd) {
                for (int r = rowEnd; r >= rowStart; r--) {
                    res.add(matrix[r][colStart]);
                }
                colStart++;
            }
        }

        return res;
    }
}