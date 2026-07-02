class Solution {
    boolean check(StringBuilder arr){
        int i=0,j=arr.length()-1;
        while(i<j){
            if(arr.charAt(i)!=arr.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder arr=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch))arr.append(Character.toLowerCase(ch));
        }
        System.out.print(arr);
        return check(arr);
    }
}
