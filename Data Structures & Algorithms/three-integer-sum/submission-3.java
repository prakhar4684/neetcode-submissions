class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 &&nums[i-1]==nums[i])continue;
            int x=nums[i];
            int p=i+1,q=n-1;
            while(p<q){
                int sum=x+nums[p]+nums[q];
                if(sum==0){
                    List<Integer>a=new ArrayList<>();
                    a.add(x);
                    a.add(nums[p]);
                    a.add(nums[q]);
                    ans.add(a);
                    p++;
                    q--;
                    while(p<q && nums[p-1]==nums[p])p++;
                    while(p<q && nums[q+1]==nums[q])q--;
                }else if(sum<0)p++;
                else q--;
            }
        }
        return ans;
    }
}
