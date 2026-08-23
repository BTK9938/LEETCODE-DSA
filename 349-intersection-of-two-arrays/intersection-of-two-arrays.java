class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m=nums1.length;
        int n=nums2.length;
        HashSet<Integer>nums=new HashSet<>();
        HashSet<Integer>res=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            nums.add(nums1[i]);
        }
        for(int i=0;i<n;i++){
            if(nums.contains(nums2[i]))
            res.add(nums2[i]);
        

        }
        int[]ans=new int[res.size()];
        int j=0;
        for(int i:res){
        ans[j]=i;j++;}
        return ans;
          
    }
}