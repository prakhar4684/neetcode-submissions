class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
            ArrayList<Integer>a=new ArrayList<>();
                map.put(nums[i],a);
            }
            map.get(nums[i]).add(i);
        }
        int i=0,j=nums.length-1;
        Arrays.sort(nums);
        int []ans=new int[2];
        while(i<=j){
            int t=nums[i]+nums[j];
            if(t==target){
                if(nums[i]==nums[j]){
                    ans[0]=map.get(nums[i]).get(0);
                    ans[1]=map.get(nums[j]).get(1);
                    break;
                }
                ans[0]=map.get(nums[i]).get(0);
                ans[1]=map.get(nums[j]).get(0);
                break;
            }
            else if(t<target){
                i++;
            }
            else{
                j--;
            }
        }
        if(ans[0]>ans[1]){
            int t=ans[0];
            ans[0]=ans[1];
            ans[1]=t;
        }
        return ans;
    }
}
