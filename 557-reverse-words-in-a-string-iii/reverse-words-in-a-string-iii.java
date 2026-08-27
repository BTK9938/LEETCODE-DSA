class Solution {
    public String reverseWords(String s) {
        String []str=s.split(" ");
        String res="";
        for(int i=0;i<str.length;i++){
            String temp=str[i];
            String rev="";
            for(int j=temp.length()-1;j>=0;j--){
                rev+=temp.charAt(j);
               // if(j>0)rev+=" ";

            }
            str[i]=rev;
           
        }
        for(int i=0;i<str.length;i++){
            res+=str[i];
            if(i!=str.length-1)res+=" ";
        }
        
        return res;
    }
}