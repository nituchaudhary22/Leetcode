class Solution {
    public int maxProduct(int[] nums) {
        int max =Integer.MIN_VALUE;
        int secondmax =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                secondmax = max;
                max =nums[i];
            }else if(nums[i]>secondmax){
                secondmax=nums[i];
            }
        }
        return ((max-1)*(secondmax-1));
    }
}