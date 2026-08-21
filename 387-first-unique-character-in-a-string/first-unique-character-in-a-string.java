class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer>list=new HashMap<>();
        char[]ch=new char[s.length()];
        ch=s.toCharArray();
        for(char c:ch){
            list.put(c,list.getOrDefault(c,0)+1);
           
        }
        for(int i=0;i<s.length();i++){
         if(list.get(s.charAt(i))==1)
          return i;
        }
        return -1;
    }
}