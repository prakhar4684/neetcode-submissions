class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        List<Integer>[] arr = new ArrayList[n+1];
        
        for(int i:map.keySet()){
            int val=i,frq=map.get(i);
            if(arr[frq]==null)arr[frq]=new ArrayList<>();
            arr[frq].add(val);
        }
        int a[]=new int[k];
        int t=0;
        for(int i=n;i>=0;i--){
            List<Integer>list=arr[i];
            if (list == null) continue;
            if(t==k)break;
            for(Integer j:list){
                a[t++]=j;
            }
        }
        return a;

    }
}
