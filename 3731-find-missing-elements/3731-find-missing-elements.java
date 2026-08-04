class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList <Integer> ans = new ArrayList<>();
        int min=nums[0];
        int max =nums[0];
        HashSet<Integer> set  = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
            set.add(nums[i]);  
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
            ans.add(i);
        }
        }
    
    return ans;
    }
}