class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String>m1=new HashMap<>();
        HashMap<String,Character>m2=new HashMap<>();
        String[]word=s.split(" ");
        if(word.length!=p.length())
        return false;
        for(int i=0;i<p.length();i++){
            if(m1.containsKey(p.charAt(i))&& !m1.get(p.charAt(i)).equals(word[i]))
            return false;
            if(m2.containsKey(word[i])&&(m2.get(word[i])!=(p.charAt(i))))
            return false;
            m1.put(p.charAt(i),word[i]);
            m2.put(word[i],p.charAt(i));
        }

        return true;

    }
}