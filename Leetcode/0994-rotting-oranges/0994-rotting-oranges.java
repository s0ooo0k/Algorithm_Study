class Solution {
    public int orangesRotting(int[][] grid) {
    
        int row = grid.length;
        int col = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int time = 0;
        int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // 큐에 썩은 오렌지 넣기
        // 신선한 오렌지 개수 세기
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==2) q.offer(new int[]{i, j});
                else if(grid[i][j]==1) fresh++;
            }
        }

        if(fresh==0) return 0;

        while(!q.isEmpty()){
            int size = q.size();
            boolean rottedThisMinute = false;
            for(int i=0; i<size; i++){
                // 체크할 썩은 오렌지
                int[] rot = q.poll();
                int r = rot[0];
                int c = rot[1];

                for(int[] dir : d) {
                    int nr = r + dir[0];
                    int nc = c+ dir[1];

                     if (nr >= 0 && nr < row && nc >= 0 && nc < col && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2; // 썩게 만듦
                        fresh--;    // 신선한 오렌지 줄이기
                        q.offer(new int[]{nr, nc});
                         rottedThisMinute = true;
                    }
                }
            }
            if (rottedThisMinute) {
                time++;
            }
        }
        if(fresh !=0) return -1;

        return time;
    }
}