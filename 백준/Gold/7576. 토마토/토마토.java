
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int M = Integer.parseInt(st.nextToken()); 
        int N = Integer.parseInt(st.nextToken()); 
        
        int[][] box = new int[N][M];
        Queue<int[]> ripe = new LinkedList<>();
        int raw=0;
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j]==1)
                    ripe.offer(new int[]{i, j});
                if(box[i][j]==0)
                    raw++;
            }
        }

        if(raw==0) {
            System.out.println(0);
            return;
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        int day=0;

        while(!ripe.isEmpty()) {
            int size = ripe.size();

            for(int i=0; i<size; i++) {
                int[] tomato = ripe.poll();

                int x = tomato[0];
                int y = tomato[1];

                for(int j=0; j<4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if(nx>=0 && ny >=0 && nx <N && ny < M && box[nx][ny]==0) {
                        box[nx][ny]=1;
                        ripe.offer(new int[]{nx, ny});
                        raw--;
                    }
                }
            }
            day++;
        }
        if(raw>0) {
            System.out.println(-1);
        } else {
            System.out.println(day-1);
        }
    }
}