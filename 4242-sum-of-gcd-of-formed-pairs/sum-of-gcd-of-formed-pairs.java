class Solution {
    static int gcd(int a, int b){
    return (b == 0) ? a : gcd(b, a % b);
    }
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int mx = 0;

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            mx = Math.max(mx, x);
            prefixGcd[i] = gcd(x, mx);
        }
        Arrays.sort(prefixGcd);

        long ans = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            ans += gcd(prefixGcd[i], prefixGcd[nums.length - i - 1]);
        }

        return ans;
    }
}