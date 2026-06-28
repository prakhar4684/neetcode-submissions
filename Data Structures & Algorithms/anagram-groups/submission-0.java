class Solution {
    List<List<String>> ans=new ArrayList<>();
    boolean isAna(String a,String b){
        int arr[]=new int[26];
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            arr[ch-'a']+=1;
        }
         for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            arr[ch-'a']-=1;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0)return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        for(int i=0;i<strs.length;i++){
            if ("$".equals(strs[i])) continue;
            List<String>curr=new ArrayList<>();
            curr.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                 if(!"$".equals(strs[j]) && isAna(strs[i],strs[j])){
                    curr.add(strs[j]);
                    strs[j]="$";
                 }
            }
            strs[i]="$";
            ans.add(curr);
        }
        return ans;
    }
}
