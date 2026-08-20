class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        HashSet<Integer> duplicates = new HashSet<>();

        for(int x : nums){
            if(!duplicates.add(x)){
                list.add(x);
            }
        }

        return list;

    }
}