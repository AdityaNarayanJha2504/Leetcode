class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                for (int j = i; j > 0 && nums[j - 1] >= pivot; j--) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                for (int j = i; j > 0 && nums[j - 1] > pivot; j--) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }
}