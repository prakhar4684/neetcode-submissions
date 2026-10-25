class Solution {
    boolean check(String s){
        int i=0,j=s.length()-1;
        for(int k=0;k<s.length();k++)System.out.print(s.charAt(k));
        System.out.println(" ");
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(check(s))return true;
        int n=s.length();
        if(check(s.substring(1,n)))return true;
        for(int i=1;i<n;i++){
            String s1=s.substring(0,i);
            String s2=s.substring(i+1,n);
            if(check(s1+s2))return true;
        }return false;
    }
}