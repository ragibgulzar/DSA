class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count = 0;
        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int num = entry.getKey();
            int occ = entry.getValue();
            if(occ==3){
                int index1 = -1;
                int index2 = -1;
                int index3 = -1;
                for(int i = 0; i < nums.length; i++){
                    if(nums[i]==num){
                        if(index1 == -1) index1 = i;
                        else if(index2 == -1) index2 = i;
                        else if(index3 == -1) index3 = i;
                    }
                }
                if(index2-index1==index3-index2) count++;
            }
        }
        return count;
    }
}