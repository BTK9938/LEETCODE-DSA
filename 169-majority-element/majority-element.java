class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>set=new HashMap<>();
        for(int num:nums){
            set.put(num,set.getOrDefault(num,0)+1);
            if(set.get(num)>nums.length/2)
            return num;
        }
        return -1;

        
    }
}