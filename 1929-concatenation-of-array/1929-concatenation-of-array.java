class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] answer=new int[nums.length+nums.length];
        for(int i=0;i<answer.length;i++){
            if(i>=nums.length){
                answer[i]=nums[i-nums.length];
            }else{
                answer[i]=nums[i];
            }
        }
        return answer;
    }
}