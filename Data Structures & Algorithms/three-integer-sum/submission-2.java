class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);   
        Set<Integer>s=new HashSet<>();                                                                                                                               
        for(int i=0;i<nums.length-2;i++){
            int val=nums[i];
            if(s.contains(val))continue;
            int x=-1*val;
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(x>sum){
                    j++;
                }
                else if(x==sum){
                    while(j+1<nums.length && nums[j+1]==nums[j])j++;
                    while(k+1<nums.length&& nums[k+1]==nums[k])k++;
                    List<Integer>l=new ArrayList<>();
                    l.add(-x);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    ans.add(l);
                    j++;
                    k--;
                }
                else{
                    k--;
                }
            }
            s.add(val);
        }
        return ans;
    }
}
