class Solution {
    public void moveZeroes(int[] nums) {
        int pos=0,i=0;
        while(pos<nums.length){
            
            if(nums[pos]!=0){
            nums[i]=nums[pos];
            i++;}
            pos++;
            
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }

        
    }
}