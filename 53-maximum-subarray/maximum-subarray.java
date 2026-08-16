class Solution {
    public int maxSubArray(int[] nums) {
        int curr_max=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            curr_max=Math.max(nums[i],curr_max+nums[i]);
            //if(curr_max<0)
            //curr_max=0;
            max=Math.max(max,curr_max);
        }
        return max;
        
    }
}