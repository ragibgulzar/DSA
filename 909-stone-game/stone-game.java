class Solution {
    int n;
    int[][] t = new int[501][501];
    public boolean stoneGame(int[] piles) {

        for (int[] row : t)
            Arrays.fill(row, -1);
        int difference = totalCount(piles,0,piles.length-1);

        return difference>0;
    }
    private int totalCount(int[] piles, int left, int right){
        if (left == right) {
            return piles[left];
        }
        if (t[left][right] != -1) return t[left][right];
        int takeLeft = piles[left] + totalCount(piles,left+1,right);
        int takeRight = piles[right] + totalCount(piles,left, right-1);

        return t[left][right] = Math.max(takeLeft, takeRight);
    }
}