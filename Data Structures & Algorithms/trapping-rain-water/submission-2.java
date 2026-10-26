class Solution {
    public int trap(int[] nums) {
      int n=nums.length;
      int p[]=new int[n];
      int s[]=new int[n];
      p[0]=nums[0];
      s[n-1]=nums[n-1];
        int ans=0;
      for(int i=1;i<n;i++){
        p[i]=Math.max(p[i-1],nums[i]);
      }
      for(int i=n-2;i>=0;i--){
        s[i]=Math.max(s[i+1],nums[i]);
      }
      for(int i=0;i<n;i++){
            ans+=Math.min(s[i],p[i])-nums[i];
      }
        return ans;
    }
}
