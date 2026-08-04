class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            if(n<min) min = n;
            if(n>max) max = n;

            set.add(n);
        }

        for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}