import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int[][] maze;
    public static int N, M;
    public static boolean[][] visited;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            for(int j=0; j<M; j++) {
                maze[i][j] = s.charAt(j) - '0';
            }
        }

        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        
        Queue<int[]> q = new LinkedList<>();

        visited[0][0] = true;
        q.offer(new int[]{0, 0});

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            if(x==N-1 && y==M-1) {
                System.out.println(maze[x][y]);
                return;
            }

            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx>=0 && nx<N && ny>=0 && ny<M && !visited[nx][ny] && maze[nx][ny]==1) {
                    visited[nx][ny] = true;
                    maze[nx][ny]=maze[x][y]+1;
                    q.offer(new int[]{nx, ny});
                }
            }
        }
    }
}