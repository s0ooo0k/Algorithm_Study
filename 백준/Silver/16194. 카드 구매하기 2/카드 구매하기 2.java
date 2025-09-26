import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] card = new int[n+1];

        for(int i=1; i<=n; i++) {
            card[i]=Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                dp[i]=Math.min(dp[i], dp[i-j]+card[j]);
            }
        }
        System.out.println(dp[n]);
    }
}