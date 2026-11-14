class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int currentSum=0;
            for(int j=i;j<nums.size();j++){
                currentSum=currentSum+nums.get(j);
                int len=j-i+1;
                if((len>=l && len<=r ) && currentSum>0){
                    minSum=Math.min(minSum,currentSum);
                }
            }
        }
        if(minSum==Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
    }
}