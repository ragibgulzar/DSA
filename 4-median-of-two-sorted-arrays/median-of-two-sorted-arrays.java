class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
         int index = 0;
         for(int i : nums1){
            mergedArray[index] =  i;
            index++;
         }
         for(int i : nums2){
            mergedArray[index] =  i;
            index++;
         }
         Arrays.sort(mergedArray);
         if(mergedArray.length%2!=0){
            return mergedArray[mergedArray.length/2];
         }
         else{
            return (double)((mergedArray[mergedArray.length/2])+(mergedArray[(mergedArray.length/2)-1]))/2;
         }
    }
}