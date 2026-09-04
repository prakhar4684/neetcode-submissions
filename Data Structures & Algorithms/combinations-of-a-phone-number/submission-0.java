class Solution {
        List<String>ans=new ArrayList<>();
        Map<Integer,List<Character>>map=new HashMap<>();
        {
            for(int i=2;i<=9;i++)map.put(i,new ArrayList<>());
            map.get(2).add('b');
            map.get(2).add('a');
            map.get(2).add('c');
            map.get(3).add('d');
            map.get(3).add('e');
            map.get(3).add('f');
            map.get(4).add('h');
            map.get(4).add('g');
            map.get(4).add('i');
            map.get(5).add('k');
            map.get(5).add('j');
            map.get(5).add('l');
            map.get(6).add('m');
            map.get(6).add('n');
            map.get(6).add('o');
            map.get(7).add('p');
            map.get(7).add('q');
            map.get(7).add('r');
            map.get(7).add('s');
            map.get(8).add('t');
            map.get(8).add('v');
            map.get(8).add('u');
            map.get(9).add('w');
            map.get(9).add('x');
            map.get(9).add('y');
            map.get(9).add('z');
        }
    void helper(int i,String curr,String s){
        if(i>=s.length()){
            
            if(curr.length()>0)ans.add(new String(curr));
            return ;
        }
        for(char ch:map.get(s.charAt(i)-'0')){
            helper(i+1,curr+ch,s);
        }
    }
    public List<String> letterCombinations(String digits) {
        helper(0,"",digits);
        return ans;
    }
}
