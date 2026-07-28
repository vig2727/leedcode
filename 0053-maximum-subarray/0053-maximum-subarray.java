class Solution {
    public int maxSubArray(int[] nums) {
        int a = nums[0];
        int b =0;
        for(int i = 0;i<nums.length;i++){
            b=b+nums[i];
            a=Math.max(a,b);
            if(b<0){
                b=0;
                
            }
            



        }
        return a;

        
    }
}