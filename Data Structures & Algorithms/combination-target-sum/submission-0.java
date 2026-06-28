class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public void helper(int idx,int t,List<Integer>curr,int []nums){
        if(idx>=nums.length){
            return;
        }
        if(t<0)return ;
        if(0==t){
            ans.add(new ArrayList(curr));
            return;
        }
        curr.add(nums[idx]);
        helper(idx,t-nums[idx],curr,nums);
        curr.remove(curr.size()-1);
        helper(idx+1,t,curr,nums);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        helper(0,target,new ArrayList<>(),nums);
        return ans;
    }
}
