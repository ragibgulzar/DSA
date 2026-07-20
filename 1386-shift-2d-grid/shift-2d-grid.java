class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        List<Integer> list = new ArrayList<>();

        for (int[] row : grid) {
            for (int num : row) {
                list.add(num);
            }
        }

        Collections.rotate(list, k);

        List<List<Integer>> ans = new ArrayList<>();

        int index = 0;

        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(list.get(index++));
            }
            ans.add(row);
        }
        return ans;
    }
}