class Solution {
    public int minMoves(int[] nums) {
        int maxn=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxn=Math.max(maxn,nums[i]);
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result+(maxn-nums[i]);
        }
        return result;
    }
}