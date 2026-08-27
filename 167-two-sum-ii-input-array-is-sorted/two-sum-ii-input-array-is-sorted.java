class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        //Arrays.sort(numbers);
        int sum=0,i=0,j=numbers.length-1;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum>target)
            j--;
            else if(sum<target)
            i++;
           else
           return new int[]{i+1,j+1};

        }
        return new int[]{};
    }
}