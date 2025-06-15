import java.util.*;

public class Main {
    static int[][] maze;
    static boolean[][] visited;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();

        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String line = sc.nextLine();
            for(int j=0; j<M; j++) {
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        int[] dx={0, 0, -1, 1};
        int[] dy={1, -1, 0, 0};

        visited[0][0] = true;
        queue.offer(new int[]{0, 0});

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<0 || ny<0 || nx>=N || ny>=M)
                    continue;
                    
                if(visited[nx][ny] || maze[nx][ny]==0) 
                    continue;

                queue.offer(new int[]{nx, ny});
                visited[nx][ny]= true;

                maze[nx][ny] = maze[x][y]+1;
            }
        }
        System.out.println(maze[N-1][M-1]);
    }
}