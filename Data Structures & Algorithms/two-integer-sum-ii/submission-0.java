class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum<target){
                i++;
            }
            else if(sum==target) {
                break;
            }
            else {
                    j--;
            }
        }
        int []ans=new int [2];
        ans[0]=i+1;
        ans[1]=j+1;
        return ans;
    }
}
