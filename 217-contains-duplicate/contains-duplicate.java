class Solution {
    public boolean containsDuplicate(int[] nums) {
 int len=nums.length;
 HashSet<Integer> set=new HashSet<Integer>();
 for(int num:nums){
    set.add(num);
 }
 if(set.size()<len)
 return true;

 
      return false;  
    }
}