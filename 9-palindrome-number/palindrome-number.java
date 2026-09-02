class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,org=x,res=0;
        if(x<0)return false;
        else{
            while(x>0){
                temp=x%10;
                res=res*10+temp;
                x/=10;
            }
            return res==org;

        }
        
    }
}