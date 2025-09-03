class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;

        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j]=='1') {
                    bfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void bfs(char[][] grid, int x, int y) {
        int[][] dr = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        grid[x][y] = '0';

        while(!q.isEmpty()) {
            int[] cur = q.poll();

            for(int[] d : dr) {
                int nx = cur[0] + d[0];
                int ny = cur[1] + d[1];

                if(nx>=0 && ny>=0 && nx < grid.length && ny < grid[0].length && grid[nx][ny]=='1') {
                    q.add(new int[]{nx, ny});
                    grid[nx][ny]='0';
                }
            }
        }
    }
}