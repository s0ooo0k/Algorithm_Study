import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static boolean[][] visited;
    static int[][] map;
    static int N;
    static int cnt = 0;
    
    static int[] dx={-1, 1, 0, 0};
    static int[] dy={0, 0, -1, 1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        
        for(int i=0; i<N; i++) {
            String s = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j]=s.charAt(j)-'0';
            }
        }

        ArrayList<Integer> block = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j] && map[i][j]==1) {
                    cnt = 0;
                    dfs(i, j);
                    block.add(cnt);
                }
            }
        }   

        // 출력
        Collections.sort(block);
        System.out.println(block.size());

        for(int b : block) {
            System.out.println(b);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        // dfs 동작 -> 블럭
        cnt++;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx>=0 && nx<N && ny>=0 && ny<N && !visited[nx][ny] && map[nx][ny]==1) {
                dfs(nx, ny);  
            }
        }
    }
}