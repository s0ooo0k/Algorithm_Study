import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] weight = new int[n+1];
        int sum = 0;

        for(int i=1; i<=n; i++) {
            weight[i]=Integer.parseInt(st.nextToken());
            sum+=weight[i];
        }

        boolean[][] dp = new boolean[n+1][sum+1];
        dp[0][0] = true;

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=sum; j++) {
                if(dp[i-1][j]) {
                    dp[i][j]=true;

                     if(j+weight[i]<=sum) {
                        dp[i][j+weight[i]]=true;
                    }
    
                    if(Math.abs(j-weight[i]) <= sum) {
                        dp[i][Math.abs(j-weight[i])]=true;
                    }
                }
            }
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<m; i++) {
            int ch = Integer.parseInt(st.nextToken());

            if(ch>sum) System.out.print("N ");
            else if(dp[n][ch]) System.out.print("Y ");
            else System.out.print("N ");
        }
    }
}