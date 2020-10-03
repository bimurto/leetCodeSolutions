package com.bimurto.leetcodesolutions;

public class Problem63UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int box[][] = new int[m + 1][n + 1];

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
            return 0;

        for (int column = 1; column <= m; column++) {
            for (int row = 1; row <= n; row++) {
                if (obstacleGrid[column - 1][row - 1] == 1) {
                    box[column][row] = -1;
                }
            }
        }

        box[1][1] = 1;

        for (int column = 1; column <= m; column++) {
            for (int row = 1; row <= n; row++) {
                if (box[column][row] == -1)
                    continue;

                int up = box[column][row - 1] == -1 ? 0 : box[column][row - 1];
                int left = box[column - 1][row] == -1 ? 0 : box[column - 1][row];
                box[column][row] += up + left;
            }
        }
        return box[m][n];
    }
}

