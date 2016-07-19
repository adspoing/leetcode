public class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        if(row == 0)    return 0;
        if(col == 0)    return 0;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        
        for(int i=1;i<col;i++){
            dp[0][i] = dp[0][i-1]+grid[0][i];
        }
        for(int j=1;j<row;j++){
            dp[j][0] = dp[j-1][0]+grid[j][0];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(dp[i-1][j]>dp[i][j-1]){
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                }else{
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                }
            }
        }
        return dp[row-1][col-1];
    }
}