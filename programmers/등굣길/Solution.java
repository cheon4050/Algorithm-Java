package 등굣길;

public class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];
        for (int[] puddle : puddles){
            dp[puddle[1]][puddle[0]] = -1;
        }

        dp[0][0] = 1;
        int result = req(0, 0, dp);

        return result;
    }

    public int req(int x, int y, int[][] dp){
        if (dp[x][y] != 0){
            return dp[x][y];
        }
        if (x == dp.length && y == dp[0].length){
            return 1;
        }
        int result = 0;

        if (x != dp.length-1 && dp[x+1][y] != -1) {
            result += req(x+1, y, dp);
        }
        if (y != dp[0].length-1 && dp[x][y+1] != -1) {
            result += req(x, y+1, dp);
        }
        dp[x][y] = result;
        return dp[x][y];
    }
}
