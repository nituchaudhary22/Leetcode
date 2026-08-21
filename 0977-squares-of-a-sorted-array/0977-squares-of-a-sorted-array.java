class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int left =0;
        int right = n-1;
        int i=n-1;
        int[] result = new int[n];
        while(left<=right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                result[i]=nums[left]*nums[left];
                left++;
            }else{
                result[i]=nums[right]*nums[right];
                right--;
            }
            i--;
        }
        return result;
    }
}