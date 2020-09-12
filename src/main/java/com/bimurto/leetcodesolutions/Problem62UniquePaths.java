package com.bimurto.leetcodesolutions;


public class Problem62UniquePaths {

    public int uniquePaths(int m, int n) {
        int box[][] = new int[m+1][n+1];
        box[1][1] = 1;
        for (int column = 1; column <= m ; column++) {
            for (int row = 1; row <= n; row++) {
                box[column][row] += box[column-1][row] + box[column][row-1];
            }
        }
        return box[m][n];
    }

//    public int uniquePaths(int m, int n) {
//        int totalPaths = 0;
//        Queue<Point> queue = new ArrayDeque<>();
//        queue.add(new Point(0, 0));
//        while (!queue.isEmpty()) {
//            Point point = queue.poll();
//            if (point.m == m - 1 || point.n == n - 1) {
//                totalPaths++;
//                continue;
//            }
//            if (point.m < m - 1) {
//                queue.add(new Point(point.m + 1, point.n));
//            }
//            if (point.n < n - 1) {
//                queue.add(new Point(point.m, point.n + 1));
//            }
//        }
//        return totalPaths;
//    }
//
//    class Point {
//        int m;
//        int n;
//
//        public Point(int m, int n) {
//            this.m = m;
//            this.n = n;
//        }
//    }

//    public void findPath(int row, int column, int m, int n) {
//        if (row == m - 1 && column == n - 1) {
//            totalPaths++;
//            return;
//        }
//        if (row < m) {
//            findPath(row + 1, column, m, n);
//        }
//        if (column < n) {
//            findPath(row, column + 1, m, n);
//        }
//    }
}
