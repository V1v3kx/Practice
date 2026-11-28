class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=Integer.MIN_VALUE;
        int rows=accounts.length;
        int cols=accounts[0].length;
        for(int i=0;i<rows;i++){
            int current=0;
            for(int j=0;j<cols;j++){
                current=current+accounts[i][j];
            }
            result=Math.max(current,result);
        }
        return result;
    }
}