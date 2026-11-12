class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase=1;
        int decrease=1;
        int maxincrease=1;
        int maxdecrease=1;
        if(nums.length<1){
            return 1;
        }
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]<nums[i-1]){
                increase++;
            }else{
                increase=1;
            }
            maxincrease=Math.max(maxincrease,increase);
        }
        for(int i=1;i<nums.length;i++){
            
            if(nums[i]>nums[i-1]){
                decrease++;
            }else{
                decrease=1;
            }
            maxdecrease=Math.max(maxdecrease,decrease);
        }
        return Math.max(maxincrease,maxdecrease);
    }
}