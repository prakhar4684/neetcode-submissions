class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1,zero=0,n=nums.length;
        for(int i:nums){
            if(i==0)zero++;
            else  pro*=i;}
        int a[]=new int[n];
        if(zero>1){
                return a;
        }
        else if(zero==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    a[i]=pro;
                }
            }
        }else{
                for(int i=0;i<n;i++){
                
                    a[i]=pro/nums[i];
                
            }
        }
            return a;
    }
}  
