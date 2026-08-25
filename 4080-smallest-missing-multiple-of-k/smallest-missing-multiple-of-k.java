class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }
        int multiple = k;
        int i = 1;
        while(true){
            multiple = k * i;
            if(!set.contains(multiple)){
                return multiple;
            }
            i++;
        }
    }
}