class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        int a=Integer.MAX_VALUE;
        for(String str:strs){
            if(a>str.length()){
                s=str;
                a=str.length();
            }
        }
        int idx=0;
        boolean flag=false;
       while(idx<s.length()){
                for(int i=0;i<strs.length;i++){
                    if(s.charAt(idx)!=strs[i].charAt(idx)) {
                        flag=true;
                        break;}
                }
                if(flag)break;
                idx++;
        }
        String ans="";
        for(int i=0;i<idx;i++){
            ans+=s.charAt(i);
        }
        return ans;
    }
}