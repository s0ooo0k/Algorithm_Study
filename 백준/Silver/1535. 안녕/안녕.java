import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] life = new int[n+1];
        int[] joy = new int[n+1];

        // dp[i][h] -> i번째까지 인사하고 h만큼 체력 썼을 때 joy
        int[][] dp = new int[n+1][101]; 
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<=n; i++) {
            life[i]=Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++) {
            joy[i]=Integer.parseInt(st.nextToken());
        }

        // 풀이
        for(int i=1; i<=n; i++) {
            for(int h=0; h<100; h++) {
                dp[i][h]=dp[i-1][h];

                if(h>=life[i]) {
                    dp[i][h]=Math.max(dp[i][h], dp[i-1][h-life[i]]+joy[i]);
                }
                
            }
        }

        int answer=0;
        for(int h=0; h<100; h++) {
            answer = Math.max(answer, dp[n][h]);
        }
        System.out.println(answer);
    }
}