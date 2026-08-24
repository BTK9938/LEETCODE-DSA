class Solution {
    public int lengthOfLastWord(String s) {
        String []str=s.split(" ");
        String w=str[str.length-1];
        return w.length();
        
    }
}