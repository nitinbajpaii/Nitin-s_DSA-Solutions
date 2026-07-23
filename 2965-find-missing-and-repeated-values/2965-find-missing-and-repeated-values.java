class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                map.put(grid[i][j], map.getOrDefault(grid[i][j], 0) + 1);
            }
        }
        for (int n : map.keySet()) {
            if (map.get(n) == 2) {
                arr[0] = n;
            }
        }
        int total = grid.length * grid.length;
        int sum = total * (total + 1) / 2;

        int totalSum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                totalSum += grid[i][j];
            }
        }
        arr[1] = sum - totalSum + arr[0];
        return arr;
    }
}