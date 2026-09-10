class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] amount: accounts){
            int sum =0;
            for(int n: amount){
                sum += n;
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}