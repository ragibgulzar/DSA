class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x:  nums){
            set.add(x);
        }
        
        int longest = 0;
        for (int num : set) {

            if(!set.contains(num-1)){
                int current = num;
                int cnt = 1;
                while(set.contains(current+1)){
                    cnt++;
                    current++;
                }

                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}