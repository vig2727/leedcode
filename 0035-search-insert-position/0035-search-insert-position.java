class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]==target){
                a=i;
                return a;
            }
            else if(nums[i]>target){
                a=i;
                return a;
            }
        }
        return nums.length;
        
    }
}