class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] count = new int[51];

        for (int start = 0; start <= nums.length - k; start++) {
            boolean[] seen = new boolean[51];

            for (int i = start; i < start + k; i++) {
                seen[nums[i]] = true;
            }

            for (int i = 0; i < 51; i++) {
                if (seen[i]) {
                    count[i]++;
                }
            }
        }

        for (int i = 50; i >= 0; i--) {
            if (count[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}