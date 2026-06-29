class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1,n=nums.length,z=0,nonz=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
             z++;
             nonz=i;}
             else pro*=nums[i];
        }
        int ans[]=new int[n];
        if(z>1)return ans;
        if(z==1){
        ans[nonz]=pro;
        return ans;}
        for(int i=0;i<n;i++){
            ans[i]=pro/nums[i];
        }
        return ans;
    }
}  
