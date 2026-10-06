class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        int freshCount = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        int fDist = 0;

        while (!q.isEmpty()) {
            int[] node = q.poll();

            int r = node[0];
            int c = node[1];
            int dist = node[2];

            fDist = Math.max(fDist, dist);

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nc >= 0 &&
                    nr < grid.length && nc < grid[0].length &&
                    grid[nr][nc] == 1) {

                    grid[nr][nc] = 2;
                    freshCount--;

                    q.add(new int[]{nr, nc, dist + 1});
                }
            }
        }

        return freshCount == 0 ? fDist : -1;
    }
}