class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int n=people.length;
        Arrays.sort(people);
        int left=0;
        int  right = n-1;
        while(left<=right){
            if(people[right]+people[left]<=limit){
            
            left++;
            }
            right--;
            count++;
        }
    return count;
    }
}