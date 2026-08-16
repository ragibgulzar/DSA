class Solution {
    public boolean stoneGameIX(int[] stones) {
        int c0 = 0;int c1 = 0;int c2 = 0;
        for(int n : stones){
             if (n % 3 == 0) c0++;
            else if (n % 3 == 1) c1++;
            else c2++;
        }

        if (c0 % 2 == 0) {
            return c1 > 0 && c2 > 0;
        }

        return Math.abs(c1 - c2) > 2;
    }
}