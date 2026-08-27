class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int k=nums.length-1;
        int sum=0;
        List<List<Integer>>res=new ArrayList<>();
        
        for(i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])
            continue;
            j=i+1;
            k=nums.length-1;
        while(j<k){
            List<Integer>temp=new ArrayList<>();
            sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                temp.add(nums[i]);
                temp.add(nums[j]);
                temp.add(nums[k]);
                res.add(temp);
                j++;
                k--;
                while(j<k&&nums[j]==nums[j-1])
                j++;
                while(j<k&&nums[k]==nums[k+1])
                k--;
            }
            else if(sum>0)k--;
            else j++;
          //  if(j==k)i++;


        }}
        return res;

    }
}