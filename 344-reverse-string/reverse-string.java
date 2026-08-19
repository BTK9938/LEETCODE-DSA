class Solution {
    public void reverseString(char[] s) {
    int r=s.length-1;
    int l=0;char temp;
   // char []str=new char[n];
    while(l<r){
      temp=s[r];
      s[r]=s[l];
      s[l]=temp;
      l++;
      r--;
    }
    System.out.println(s);

        
    }
}