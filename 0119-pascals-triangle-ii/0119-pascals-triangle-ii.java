class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans =new ArrayList<>();
        ans.add(1);
        for(int i=1;i<=rowIndex;i++){
            ArrayList<Integer> result = new ArrayList<>();
            result.add(1);
            for(int j=1;j<ans.size();j++){
                result.add(ans.get(j-1)+ans.get(j));
            }
            result.add(1);
            ans = result;
        }
        return ans;
    }
}