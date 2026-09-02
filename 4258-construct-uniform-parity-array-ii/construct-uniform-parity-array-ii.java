class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean oddPresent = false;
        for(int n: nums1){
            min = Math.min(min, n);
            if(n%2==1){
                oddPresent = true;
            }
        }

        if(min%2==0 && oddPresent){
            return false;
        }
        return true;
    }
}