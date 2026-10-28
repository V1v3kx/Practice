class Solution {
    public int minCost(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        Set<Integer>[][] dp=new HashSet[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=new HashSet<>();
            }
        }

        dp[0][0].add(grid[0][0]);

        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(dp[r][c].isEmpty()) continue;
                for(int xorVal:dp[r][c]){
                    if(r+1<m){
                        dp[r+1][c].add(xorVal^grid[r+1][c]);
                    }
                    if(c+1<n){
                        dp[r][c+1].add(xorVal^grid[r][c+1]);
                    }
                }
            }
        }
        int minXor=Integer.MAX_VALUE;
        for(int xorVal:dp[m-1][n-1]){
            minXor=Math.min(minXor,xorVal);
        }

        return minXor;
    }
}