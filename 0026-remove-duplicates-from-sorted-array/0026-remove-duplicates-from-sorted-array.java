class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        for(int i = 0 ; i<nums.length;i++){
            if(nums1.contains(nums[i])){
                int g=0;
            }
            else{
                nums1.add(nums[i]);
            }

        }

        for(int j = 0 ; j<nums1.size();j++){
            nums[j]=nums1.get(j);
        }
        return nums1.size();
        
    }
}