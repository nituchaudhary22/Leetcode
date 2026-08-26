class Solution {
    private int BinarySearch(int[] arr,int target,boolean first){
        int n = arr.length;
        int low =0;
        int high = n-1;
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]== target){
                ans=mid;
                if(first){
                    high = mid-1;
                }else{
                    low= mid+1;
                }

            }else if(arr[mid]>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = BinarySearch(nums,target,true);
        int last = BinarySearch(nums,target,false);
        return new int[]{first,last};
    }
}