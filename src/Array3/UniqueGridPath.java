package Array3;
import java.util.* ;
public class UniqueGridPath {
    public static int uniquePaths(int m, int n) {
        // Write your code here.
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, 0, m, n, dp);
    }

    private static int solve(int i, int j, int m, int n, int[][] dp){
        //base case
        if(i == m-1 && j == n-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];

        // go right
        int rightPath = 0;
        if(j < n){
            rightPath = solve(i, j+1, m, n, dp);
        }
        //go down
        int downPath = 0;
        if(i < m){
            downPath = solve(i+1, j, m, n, dp);
        }
        return dp[i][j] = rightPath + downPath;
    }
}
