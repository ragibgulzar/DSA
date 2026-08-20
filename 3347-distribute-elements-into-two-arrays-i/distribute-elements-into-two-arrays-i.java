class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        arr1[0] = nums[0];
        arr2[0] = nums[1];
        
        int index1 = 0;
        int index2 = 0;

        for(int i = 2; i < n; i++){
            if(arr1[index1]>arr2[index2]){
                index1++;
                arr1[index1] = nums[i];
            } else{
                index2++;
                arr2[index2] = nums[i];
            }
        }

        for(int i = 0; i <= index2; i++){
            index1++;
            arr1[index1] = arr2[i];
        }

        return arr1;
    }
}