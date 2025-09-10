import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); 
        int K = Integer.parseInt(st.nextToken()); // 최대 무게

        int [][] item = new int[N+1][2];
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            item[i][0]=Integer.parseInt(st.nextToken());
            item[i][1]=Integer.parseInt(st.nextToken());
        }

        int[][] dp = new int[N+1][K+1];

        for(int i=1; i<=N; i++) {
            int weight = item[i][0];
            int value = item[i][1];

            for(int w=1; w<=K; w++) {
                if(w>=weight) {
                    dp[i][w] = Math.max(dp[i-1][w], dp[i-1][w-weight]+value);
                }
                else {
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}