class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    arr.add(i);
                    arr.add(j);
                }
            }
        }
        for(int i=0;i<arr.size();i+=2){
            int row=arr.get(i);
            int col = arr.get(i+1);
            for(int r=0;r<n;r++){
                matrix[r][col]=0;
            }
            for(int c=0;c<m;c++){
                matrix[row][c]=0;
            }
        }

    }
}