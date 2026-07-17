class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
          int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        long[] cnt = new long[max + 1];

        for (int x : nums) {
            cnt[x]++;
        }

        for (int g = 1; g <= max; g++) {
            long c = 0;
            for (int multiple = g; multiple <= max; multiple += g) {
                c += cnt[multiple];
            }
            cnt[g] = c * (c - 1) / 2;
        }

        for (int g = max; g >= 1; g--) {
            for (int multiple = g + g; multiple <= max; multiple += g) {
                cnt[g] -= cnt[multiple];
            }
        }

        for (int i = 1; i <= max; i++) {
            cnt[i] += cnt[i - 1];
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = lowerBound(cnt, max, queries[i] + 1);
        }

        return ans;
    }

    private int lowerBound(long[] prefix, int max, long target) {
        int lo = 1, hi = max;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (prefix[mid] >= target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}