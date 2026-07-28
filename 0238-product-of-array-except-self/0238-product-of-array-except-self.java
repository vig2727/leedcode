class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] vig = new int[nums.length];
        int[] vpm = new int[nums.length];
        int a = 1;
        vig[0]=1;
        for(int i = 0 ; i<nums.length-1;i++){
            a=a*nums[i];
            vig[i+1]=a;     
        }
        a=1;
        vpm[nums.length-1]=1;
        System.out.println(vpm[0]);
        for(int j = vig.length-1;j>0;j--){
            a=a*nums[j];
            vpm[j-1]=a;
            System.out.println(vpm[j-1]);  
        }
        for(int m = 0;m<nums.length;m++){
            vig[m]=vig[m]*vpm[m];
        }
        return vig;

    }
}