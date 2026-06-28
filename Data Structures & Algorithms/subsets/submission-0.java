class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int idx ,List<Integer>curr,int []nums){
        ans.add(new ArrayList(curr));
        for(int i=idx;i<nums.length;i++){
            curr.add(nums[i]);
            helper(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        helper(0,new ArrayList<>(),nums);
        return ans;
    }
}
